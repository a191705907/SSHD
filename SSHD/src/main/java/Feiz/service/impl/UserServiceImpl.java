package Feiz.service.impl;
import Feiz.dao.UserDao;
import Feiz.po.User;
import Feiz.service.UserService;
import java.util.List;
/**
 * Created by zl on 1/21/2015.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }
    @Override
    public List<User> findUserByName(String name) {
        return userDao.findUserByName(name);
    }
    @Override
    public List<User> listAll() {
        return userDao.listAll();
    }
}