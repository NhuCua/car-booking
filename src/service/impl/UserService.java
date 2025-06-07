package service.impl;

import model.User;
import service.IView;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IView {
    List<User> users = new ArrayList<User>();

    public List<User> getListUsers() {
        return users;
    }

    public void initListUsers() {
        users.add(new User("Cua", "1"));
        users.add(new User("Hoa", "2"));
        users.add(new User("Kiet", "3"));
    }

    @Override
    public void view() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
