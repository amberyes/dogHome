package action;

import model.DB.*;
import dao.LyDao;
import dao.imp.LyDaoimp;
import model.Lyb;
import model.Dlb;
import java.util.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LyAction extends ActionSupport {
    LyDao lyDao;
    //定义学生对象
    private Lyb lyer;

    public Lyb getLyer() {
        return lyer;
    }

    public void setLyer(Lyb lyer) {
        this.lyer = lyer;
    }

    public String execute() throws Exception {
        //获得Session对象
        Map session = (Map) ActionContext.getContext().getSession();
        //从Session中取出当前用户
        Dlb users = (Dlb) session.get("user");
        //创建XsDao接口对象
        lyDao = new LyDaoimp();
        //根据登录学号得到该学生信息
        List list = lyDao.getAll();
        Map request = (Map) ActionContext.getContext().get("request");
        //保存
        request.put("list", list);
        return SUCCESS;
    }
    public String getOne() throws Exception {
        //获得Session对象
        Map session = (Map) ActionContext.getContext().getSession();
        //从Session中取出当前用户
        Dlb users = (Dlb) session.get("user");
        //创建XsDao接口对象
        lyDao = new LyDaoimp();
        //根据登录学号得到该学生信息
        List list = lyDao.getOnely(users.getUsername());
        Map request = (Map) ActionContext.getContext().get("request");
        //保存
        request.put("list", list);
        Dlb unum=lyDao.getnum(users.getUsername());
        Map requeste = (Map) ActionContext.getContext().get("request");
        requeste.put("unum", unum);
        return SUCCESS;
    }


    public String addlysInfo() throws Exception {
        Map session=(Map)ActionContext.getContext().get("session");
        Dlb user=(Dlb)session.get("user");
        lyer.setUsername(user.getUsername());

        DB db=new DB();
        if(db.addInfo(lyer)) {
            ArrayList al = db.findLyInfo();
            session.put("al", al);
            db.closeConn();
            return SUCCESS;

        }
        return ERROR;
    }
    public String detOne()throws Exception{


        if(new DB().deleteLiuyan(lyer.getId())){
            return SUCCESS;
        }
        return ERROR;


    }

}
