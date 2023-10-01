package com.berhan.Criteria;

import com.berhan.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Methods<T> implements ICrud<T>{

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

    public void closeSession(){
        transaction.commit();
        session.close();
    }
    @Override
    public List<T> findAll() {
        openSession();
        CriteriaQuery<T> query = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root = (Root<T>) query.from(t.getClass());
        query.select(root);
        List<T> list = entityManager.createQuery(query).getResultList();
        list.forEach(x->{
            System.out.println(x.toString());
        });
        closeSession();
        return list;
    }

    @Override
    public T findById(Long id) {
       openSession();
       CriteriaQuery<T> query = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
       Root<T> root = (Root<T>) query.from(t.getClass());
       query.select(root);
       query.where(criteriaBuilder.equal(root.get("id"),id));
        T result = (T) entityManager.createQuery(query).getSingleResult();
        System.out.println(result.toString());
        openSession();
        closeSession();

        return null;
    }
}
