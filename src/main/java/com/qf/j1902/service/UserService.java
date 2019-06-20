package com.qf.j1902.service;

import com.qf.j1902.pojo.User;

import java.util.List;

public interface UserService {
    List<User> users();
    boolean addUser(User user);

    boolean deleteUser(int id);

    User findUser(int id);

    boolean updateUser(User user);

}
