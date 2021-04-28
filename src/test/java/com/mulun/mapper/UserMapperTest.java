package com.mulun.mapper;

import com.mulun.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void listUsers() {
        List<User> list = userMapper.listUsers();

        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    void getUserById() {
        User userById = userMapper.getUserById(1);

        System.out.println("==========>" + userById);
    }

    @Test
    void insertUser() {
        User user = new User(null, "mulun", "123456", "mulun3", '1', "17633333333", "mulun@qq.com", "郑州", new Date(), 0, 0);

        Integer integer = userMapper.insertUser(user);

        System.out.println(integer);
    }

    @Test
    void updateUser() {
        User user = new User(2, "mulun", "123456", "mulun777", '1', "17633333333", "mulun@qq.com", "郑州", new Date(), 0, 0);

        Integer integer = userMapper.updateUser(user);

        System.out.println(integer);
    }

    @Test
    void deleteUserById() {
        Integer integer = userMapper.deleteUserById(2);

        System.out.println(integer);
    }
}
