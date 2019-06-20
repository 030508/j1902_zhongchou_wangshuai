package com.qf.j1902.mapper;

import com.qf.j1902.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> users();
    boolean addUser(User user);

    boolean deleteUser(@Param("uid") int uid);

    User findUser(int id);

    boolean updateUser(User user);
}
