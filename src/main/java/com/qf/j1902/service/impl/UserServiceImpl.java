package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.UserMapper;
import com.qf.j1902.pojo.User;
import com.qf.j1902.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> users() {
        return userMapper.users();
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return userMapper. deleteUser( id);
    }

    @Override
    public User findUser(int id) {
        return  userMapper.findUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        return  userMapper.updateUser(user);
    }
}
