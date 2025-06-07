package dao.iml;

import dao.Dao;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<User> {

    private final List<User> users = new ArrayList<>();

    public UserDao() {
        users.add(new User("Cua", "1"));
        users.add(new User("Hoa", "2"));
        users.add(new User("Kiet", "3"));
    }


    @Override
    public void viewAll() {
        for (User user : users) {
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println("-------------------");
        }
    }

    @Override
    public List<User> getAll() {
        return users;
    }

}
