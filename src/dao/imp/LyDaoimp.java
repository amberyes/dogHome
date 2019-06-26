package dao.imp;

import dao.LyDao;
import model.Lyb;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Dlb;
import java.text.SimpleDateFormat;
import java.util.*;
public class LyDaoimp implements LyDao{

//    @Override
    public List getOnely(String username) {


            try {
                Session session = util.HibernateSessionFactory.getSession();
                Transaction ts = session.beginTransaction();
                Query query = session.createQuery("from Lyb where username=?1");
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
    public Dlb getnum(String username){

        try {
            Session session = util.HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Dlb where username=?1");
            query.setParameter(1, username);
            Dlb dlb=(Dlb)query.uniqueResult();
            if(dlb!=null){
                return dlb;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    public List getAll() {
        try {
            Session session = util.HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Lyb");

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
