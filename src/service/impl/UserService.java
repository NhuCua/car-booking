package service.impl;

import model.User;
import service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {

    private List<User> initListUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Cua", "1"));
        users.add(new User("Hoa", "2"));
        users.add(new User("Kiet", "3"));
        return  users;
    }

    public void viewAllUsers() {
        List<User> users = initListUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }


}
