package com.berhan.utility;

import com.berhan.utility.HibernateUtility;
import com.berhan.utility.ICrud;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class Methods<T> implements ICrud<T> {

    Session session;
    Transaction transaction;
    CriteriaBuilder criteriaBuilder;
    EntityManager entityManager;
    T t;

    public Methods(T t){
        entityManager = HibernateUtility.getSessionFactory().createEntityManager();
         criteriaBuilder = entityManager.getCriteriaBuilder();
         this.t = t;
    }

    public void openSession(){
        session= HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();
    }
                                     //entity manager kullanılan işlemlerde sessiona ggerek yoktur!!!!!!

    public void closeSession(){
        transaction.commit();
        session.close();
    }
    @Override
    public List<T> findAll() {
        CriteriaQuery<T> query = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root = (Root<T>) query.from(t.getClass());
        query.select(root);
        List<T> list = entityManager.createQuery(query).getResultList();
        list.forEach(x->{
            System.out.println(x.toString());
        });
        return list;
    }

    @Override
    public Optional<T> findById(Long id) {

       CriteriaQuery<T> query = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
       Root<T> root = (Root<T>) query.from(t.getClass());
       query.select(root);
       query.where(criteriaBuilder.equal(root.get("id"),id));
        Optional<T> result = (Optional<T>) entityManager.createQuery(query).getSingleResult();
        System.out.println(result.toString());

        return result;
    }

    @Override
    public T save(T entity) {
      openSession();
      session.save(entity);
      closeSession();
        return entity;
    }

    @Override
    public void update(T entity) {
        openSession();
        session.update(entity);
        closeSession();
    }


}
