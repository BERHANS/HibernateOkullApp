//package com.berhan.repository.hql;
//
//import com.berhan.repository.entity.Sinif;
//import com.berhan.utility.HibernateUtility;
//import com.berhan.utility.ICrud;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import java.util.List;
//
//public class SinifDao implements ICrud {
//
//Session session;
//Transaction transaction;
//
//    public void openSession(){
//        session= HibernateUtility.getSessionFactory().openSession();
//        transaction=session.beginTransaction();
//    }
//
//
//    public void closeSession(){
//        transaction.commit();
//        session.close();
//    }
//
//    @Override
//    public List<Sinif> findAll() {
//      openSession();
//        String hql = "From Sinif";
//        List<Sinif> sinifList = session.createQuery(hql).list();
//        for (Sinif sinif : sinifList) {
//            System.out.println(sinif);
//        }
//        closeSession();
//        return sinifList;
//    }
//
//    @Override
//    public Sinif findById(Long id) {
//       openSession();
//       String hql="From Sinif Where id =:x";
//       List<Sinif> sinifList = session.createQuery(hql).setParameter("x",id).list();
//       sinifList.forEach(System.out::println);
//        return null;
//    }
//
//    @Override
//    public Object save(Object entity) {
//        return null;
//    }
//
//    @Override
//    public void update(Object entity) {
//
//    }
//}
