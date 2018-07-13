package db;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBHelper {
    private static Transaction transaction;
    private static Session session;

    public static void save(Object object){
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void update(Object object){
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void delete(Object object){
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static <T> List<T> getAll(Class classType) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        try {
            Criteria cr = session.createCriteria(classType);
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static <T> T find(Class classType, int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        T result = null;
        try {
            Criteria cr = session.createCriteria(classType);
            cr.add(Restrictions.eq("id", id));
            //> Note that the restriction should be on the java property not the database column. So if we were trying to find by name it would be eq("firstName") not eq("first_name")
            result = (T) cr.uniqueResult();
            //`uniqueResult()` however isn't that clever and just returns a type `Object`. In order to tell Java that it is a pirate we will have to cast the object that is returned to a pirate.
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }






//- To get records having age more than 25
//
//cr.add(Restrictions.gt("age", 25));
//```
//        - To get records having age less than 25
//
//cr.add(Restrictions.lt("age", 25));
//```
//        - To get records having fistName starting with jac
//cr.add(Restrictions.like("firstName", "jac%"));
//```
//
//        - Case sensitive form of the above restriction.
//cr.add(Restrictions.ilike("firstName", "Jac%"));
//```
//
//        - To get records having age in between 25 and 35
//cr.add(Restrictions.between("age", 25, 35));


//    `Projections` have a number of handy methods:
//
//            - To get total row count.
//cr.setProjection(Projections.rowCount());
//
//        - To get average of a property.
//
//cr.setProjection(Projections.avg("age"));
//
//        - To get distinct count of a property.
//
//cr.setProjection(Projections.countDistinct("firstName"));
//
//        - To get maximum of a property.
//
//cr.setProjection(Projections.max("age"));
//
//        - To get minimum of a property.
//
//cr.setProjection(Projections.min("age"));
//```
//
//        - To get sum of a property.
//
//cr.setProjection(Projections.sum("age"));













}
