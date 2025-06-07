package service.impl;

import dao.iml.UserDao;
import model.User;

import java.util.List;

public class UserService {

    UserDao userDao = new UserDao();

    public void viewAll() {
        userDao.viewAll();
    }


    public List<User> getAll() {
        return userDao.getAll();
    }
}
