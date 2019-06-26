package dao;

import model.Dlb;
public interface DlDao {
    //登陆验证接口，通过用户名和密码验证，如果返回结果是NULL则不成功，否则返回登陆对象
    public Dlb validate(String username,String password);
}

