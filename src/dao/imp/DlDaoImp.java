package dao.imp;
import dao.DlDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Dlb;
public class DlDaoImp implements DlDao {
    public Dlb validate(String username, String password) {
        try{
            Session session=util.HibernateSessionFactory.getSession();
            Transaction ts=session.beginTransaction();
            Query query=session.createQuery("from Dlb where username=?1 and password=?2");
            query.setParameter(1, username);
            query.setParameter(2, password);

            Dlb dlb=(Dlb)query.uniqueResult();
            if(dlb!=null){
                return dlb;
            }else{
                return null;
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

