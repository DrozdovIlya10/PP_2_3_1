package dao;

import model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    public List<User> userCar(String model, int series);
}
