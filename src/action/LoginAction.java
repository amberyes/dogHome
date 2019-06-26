package action;

import model.Dlb;
import java.util.Map;
import dao.DlDao;
import dao.imp.DlDaoImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

    // Dlb对象
    private Dlb dlb;



    // get一个dlb对象
    public Dlb getDlb() {
        return dlb;
    }
    //从页面中获取Dlb对象
    public void setDlb(Dlb dlb) {
        this.dlb = dlb;
    }
    public String execute() throws Exception {
        DlDao dlDao=new DlDaoImp();//面向接口
        Dlb user=dlDao.validate(dlb.getUsername(), dlb. getPassword());
        if(user!=null){

            Map session=(Map)ActionContext.getContext().getSession();
            session.put("user", user);
            return SUCCESS;
        }else{
            return ERROR;
        }
    }



}

