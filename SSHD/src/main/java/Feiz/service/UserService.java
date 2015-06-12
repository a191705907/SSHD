package Feiz.service;
import Feiz.po.User;
import java.util.List;
/**
 * Created by zl on 1/21/2015.
 */
public interface UserService {
    public String addUser(User user);
    public List<User> findUserByName(String name);
    public List<User> listAll();
}