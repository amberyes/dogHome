package dao.imp;
import dao.UsDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Userb;
import model.Dlb;
public class UsDaoimp implements UsDao{
    public Userb getOneXs(String username) {
        try {
            Session session = util.HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Userb where username=?1");
            query.setParameter(1, username);
            query.setMaxResults(1);
            Userb user = (Userb) query.uniqueResult();
            ts.commit();
            session.clear();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Dlb getOneUs(String username){
        try {
            Session session = util.HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Dlb where username=?1");
            query.setParameter(1, username);
            query.setMaxResults(1);
            Dlb user = (Dlb) query.uniqueResult();
            ts.commit();
            session.clear();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Userb finduesr(String username,String email) {
        try {
            Session session = util.HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Userb where username=?1 and email=?2");
            query.setParameter(1, username);
            query.setParameter(2, email);
            query.setMaxResults(1);
            Userb user = (Userb) query.uniqueResult();
            ts.commit();
            session.clear();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void update(Userb user) {
        try{
            Session session=util.HibernateSessionFactory.getSession();
            Transaction ts=session.beginTransaction();
            session.update(user);
            ts.commit();
            util.HibernateSessionFactory.closeSession();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     public void gxmm(Dlb user) {
         try{
             Session session=util.HibernateSessionFactory.getSession();
             Transaction ts=session.beginTransaction();
             session.update(user);
             ts.commit();
             util.HibernateSessionFactory.closeSession();
         }catch(Exception e){
             e.printStackTrace();
         }
    }

}
