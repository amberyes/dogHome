package model.DB;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.Lyb;
import model.Userb;
import model.Userdog;
public class DB {
    //数据库用户名
    private static final String DB_USER = "root";
    //数据库密码
    private static final String DB_PASSWORD = "yss123456";
    //驱动信息
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    //数据库地址
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&amp;characterEncoding=utf-8";
    //数据连接
    private Connection connection;
    //执行语句
    private PreparedStatement pstmt;
    //结果集
    private ResultSet resultSet;

    // 默认构造函数，打开MySQL数据库
    public DB(){
        try {
            Class.forName(DB_DRIVER);
            connection=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 根据用户名和密码检查数据库中是否有该用户，如有则返回该用户，如果没有则返回空
    public Userb checkUser(String username,String password){
        try{
            pstmt=connection.prepareStatement("select * from usertable where username=? and password=?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs=pstmt.executeQuery();
            Userb user=new Userb();
            while(rs.next()){
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                return user;
            }
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public boolean deleteUs(String username){
        try{
            pstmt=connection.prepareStatement("delete from dlb where username=?");
            pstmt.setString(1, username);
            pstmt.executeUpdate();
            pstmt=connection.prepareStatement("delete from userb where username=?");
            pstmt.setString(1, username);
            pstmt.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteLiuyan(int id){
        try{
            pstmt=connection.prepareStatement("delete from lyb where id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean deletedog(int id){
        try{
            pstmt=connection.prepareStatement("delete from userdog where id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    // 返回所有留言数据，以ArrayList数据链表形式，里面存放了留言类的对象集合
    public ArrayList findLyInfo(){
        try{
            ArrayList al=new ArrayList();
            pstmt=connection.prepareStatement("select * from lyb");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                Lyb ly=new Lyb();
                ly.setId(rs.getInt(1));
                ly.setUsername(rs.getString(2));
                ly.setText(rs.getString(3));
                ly.setDate(rs.getString(4));
                al.add(ly);
            }
            return al;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // 返回所有留言数据，以ArrayList数据链表形式，里面存放了留言类的对象集合
//    public ArrayList deleteLiuyan(int id){
//        try{
//            pstmt=connection.prepareStatement("delete from lytable where id=?");
//            pstmt.setInt(1, id);
//            pstmt.executeUpdate();
//            ArrayList al=new ArrayList();
//            pstmt=connection.prepareStatement("select * from lytable");
//            ResultSet rs=pstmt.executeQuery();
//            while(rs.next()){
//                LyTable ly=new LyTable();
//                ly.setId(rs.getInt(1));
//                ly.setUserId(rs.getInt(2));
//                ly.setDate(rs.getString(3));
//                ly.setTitle(rs.getString(4));
//                ly.setContent(rs.getString(5));
//                al.add(ly);
//            }
//            return al;
//        }catch(Exception e){
//            e.printStackTrace();
//            return null;
//        }
//    }


    //根据用户的id得到用户名
    public String getUserName(int id){
        String username = null;
        try{
            pstmt = connection.prepareStatement("select username from usertable where id = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                username=rs.getString(1);
            }
            return username;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean insertUser(String username,String pwd,String email,String tel){

        try{
            pstmt=connection.prepareStatement("insert into dlb(username,password) values(?,?)");
            pstmt.setString(1, username);
            pstmt.setString(2, pwd);
            pstmt.executeUpdate();
            pstmt=connection.prepareStatement("insert into userb(username,password,email,tel) values(?,?,?,?)");
            pstmt.setString(1, username);
            pstmt.setString(2, pwd);
            pstmt.setString(3, email);
            pstmt.setString(4, tel);
            pstmt.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean addInfo(Lyb ly){
        try{
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
            pstmt=connection.prepareStatement("insert into lyb(username,text,date) values(?,?,?)");
            pstmt.setString(1, ly.getUsername());
            pstmt.setString(2, ly.getText());
            pstmt.setString(3,ft.format(new Date( )));
            pstmt.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean adddog(Userdog dog){
        try{

            pstmt=connection.prepareStatement("insert into userdog(uername,leixing,dogname) values(?,?,?)");
            pstmt.setString(1, dog.getUername());
            pstmt.setString(2, dog.getLeixing());
            pstmt.setString(3, dog.getDogname());
            pstmt.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public void closeConn() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
