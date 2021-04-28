package com.mulun.service;

import com.mulun.mapper.UserMapper;
import com.mulun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findUserList() {
        return userMapper.listUsers();
    }

    public User findUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    public Integer add(User user) {
        return userMapper.insertUser(user);
    }

    public Integer modify(User user) {
        return userMapper.updateUser(user);
    }

    public Integer remove(Integer id) {
        return userMapper.deleteUserById(id);
    }

}
