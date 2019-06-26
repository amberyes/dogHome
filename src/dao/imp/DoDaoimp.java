package dao.imp;

import dao.DoDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.*;
public class DoDaoimp implements DoDao{

    //    @Override
    public List getOnely(String username) {


        try {
            Session session = util.HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Userdog where uername=?1");
            query.setParameter(1, username);
            List liste = (List) query.list();
            ts.commit();
            session.clear();
            return liste;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public List getAll() {
        try {
            Session session = util.HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Userdog");

            List list = (List) query.list();
            ts.commit();
            session.clear();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
