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
    public List<User> getAll() {
        return users;
    }

    public List<User> getAllUserByIds(List<String> ids) {
        return users.stream().filter(user -> ids.contains(user.getId())).toList();
    }
    public String getUserIdByIndex(int index) {
        if (index < 0 || index >= users.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return users.get(index).getId();
    }


}
