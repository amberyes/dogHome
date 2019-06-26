package dao;

import model.Lyb;
import java.util.*;
import model.Dlb;
public interface LyDao {
    public List getOnely(String username) ;
    public List getAll() ;
    public Dlb getnum(String username) ;
}
