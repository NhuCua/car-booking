package service.impl;

import dao.iml.UserDao;
import model.User;

import java.util.List;

public class UserService {

    UserDao userDao = new UserDao();

    public void viewAll() {
        List<User> users =  userDao.getAll();
        for (User user : users) {
            System.out.println(user.toString());
            System.out.println("-------------------");
        }
    }

    public List<User> getAll() {
        return userDao.getAll();
    }

    public void viewAllUserByIds(List<String> ids) {
        List<User> users = userDao.getAllUserByIds(ids);
        for (User user : users) {
            System.out.println(user.toString());
        }
        System.out.println("-------------------");
    }
}
