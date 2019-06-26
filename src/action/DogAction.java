package action;

import dao.DoDao;
import dao.imp.DoDaoimp;
import model.Dlb;
import java.util.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import model.Userdog;
import model.DB.DB;
public class DogAction extends ActionSupport {
    DoDao doDao;
    //定义学生对象
    private Userdog dog;

    public Userdog getDog() {
        return dog;
    }

    public void setDog(Userdog dog) {
        this.dog = dog;
    }

    public String execute() throws Exception {
        //获得Session对象
        Map session = (Map) ActionContext.getContext().getSession();
        //从Session中取出当前用户
        Dlb users = (Dlb) session.get("user");
        //创建XsDao接口对象
        doDao = new DoDaoimp();
        //根据登录学号得到该学生信息
        List list = doDao.getOnely(users.getUsername());
        Map request = (Map) ActionContext.getContext().get("request");
        //保存
        request.put("list", list);
        return SUCCESS;
    }



   public String addes() throws Exception {
        Map session=(Map)ActionContext.getContext().get("session");
        Dlb user=(Dlb)session.get("user");
        dog.setUername(user.getUsername());

        DB db=new DB();
        if(db.adddog(dog)) {
            ArrayList al = db.findLyInfo();
            session.put("al", al);
            db.closeConn();
            return SUCCESS;

        }
        return ERROR;
    }

    public String dete()throws Exception{


        if(new DB().deletedog(dog.getId())){
            return SUCCESS;
        }
        return ERROR;


    }

}
