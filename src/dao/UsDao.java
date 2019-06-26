package dao;

import model.Userb;
import model.Dlb;
public interface UsDao {
    //通过学号获得一个学生对象
    public Userb getOneXs(String username);
    public Dlb getOneUs(String username);
    //更新一个学生对象
    public void update(Userb us);
    public void gxmm(Dlb user);
    public Userb finduesr(String username,String email);
}
