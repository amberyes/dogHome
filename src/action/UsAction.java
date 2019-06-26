package action;

import java.util.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import model.DB.DB;
import model.Userb;
import dao.UsDao;
import dao.imp.UsDaoimp;
import model.Dlb;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UsAction extends ActionSupport{
    UsDao usDao;
    //定义学生对象
    private Userb user;

    //下面生成它们的get和set方法

    public Userb getUser() {
        return user;
    }

    public void setUser(Userb user) {
        this.user = user;
    }

    //默认情况下，用该方法 ，获得当前学生的个人信息
    public String execute() throws Exception {
        //获得Session对象
        Map session=(Map)ActionContext.getContext().getSession();
        //从Session中取出当前用户
        Dlb users=(Dlb) session.get("user");
        //创建XsDao接口对象
        usDao=new UsDaoimp();
        //根据登录学号得到该学生信息
        Userb use=usDao.getOneXs(users.getUsername());
        Map request=(Map)ActionContext.getContext().get("request");
        //保存
        request.put("use", use);
        return SUCCESS;
    }

    //这里后面还要加入其他方法，这里先不列出，用到后会列出代码，就要加入到这里
    //进入修改学生信息页面
    public String updateUsInfo()throws Exception{
        //获取当前用户对象
        Map session=(Map)ActionContext.getContext().getSession();
        Dlb users=(Dlb) session.get("user");
        usDao=new UsDaoimp();
        //得到当前学生的信息
        Userb us = usDao.getOneXs(users.getUsername());
        Map request=(Map)ActionContext.getContext().get("request");

        request.put("us", us);
        return SUCCESS;
    }
    //修改学生信息
    public String updateUs()throws Exception{
        usDao =new UsDaoimp();
        //创建一个学生对象，用于存放要修改的学生信息

        Userb su=new Userb();
        //设置学生学号
        su.setId(user.getId());
        su.setUsername(user.getUsername());
        su.setPassword(user.getPassword());
        su.setEmail(user.getEmail());
        su.setTel(user.getTel());

        //修改
        usDao.update(su);
        return SUCCESS;
    }
    public String intUserInfo()throws Exception{



        String check= "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(user.getEmail());
        boolean isMatched = matcher.matches();

         String checktel = "^(13[4,5,6,7,8,9]|15[0,8,9,1,7]|188|187)\\d{8}$";
         Pattern regextel = Pattern.compile(checktel);
         Matcher matchertel = regextel.matcher(user.getTel());
         boolean isMatchedtel = matchertel.matches();

            if(isMatched){
                if(isMatchedtel){
                    if(new DB().insertUser(user.getUsername(),user.getPassword(),user.getEmail(),user.getTel())){
                        return SUCCESS;
                    }
                }
            }

        return ERROR;

    }

    public String deteUserInfo()throws Exception{
        Map session=(Map)ActionContext.getContext().getSession();
        Dlb users=(Dlb) session.get("user");
        usDao=new UsDaoimp();
        //得到当前学生的信息
        Userb us = usDao.getOneXs(users.getUsername());
        if(new DB().deleteUs(us.getUsername())){
            return SUCCESS;
        }
        return ERROR;
    }
    public String findus()throws Exception{

        usDao=new UsDaoimp();
        //得到当前学生的信息
        Userb us = usDao.finduesr(user.getUsername(),user.getEmail());
        if(us!=null)
        return SUCCESS;
        else
        return ERROR;
    }
    public String chanus()throws Exception{

        usDao=new UsDaoimp();
        //得到当前学生的信息
        Userb us = usDao.getOneXs(user.getUsername());

        Userb su=new Userb();
        //设置学生学号
        su.setId(us.getId());
        su.setUsername(us.getUsername());
        su.setPassword(user.getPassword());
        su.setEmail(us.getEmail());
        su.setTel(us.getTel());
        usDao.update(su);
        Dlb dl=usDao.getOneUs(user.getUsername());
        Dlb dlg=new Dlb();
        dlg.setId(dl.getId());
        dlg.setUsername(dl.getUsername());
        dlg.setPassword(user.getPassword());
        //修改
        usDao.gxmm(dlg);

        return SUCCESS;
    }
}
