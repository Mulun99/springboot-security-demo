package com.mulun.service;

import com.mulun.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void findUserList() {
        List<User> userList = userService.findUserList();

        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    void findUserById() {
        User user = userService.findUserById(1);

        System.out.println(user);
    }

    @Test
    void add() {
        User user = new User(null, "mulun", "123456", "mulun3", '1', "17633333333", "mulun@qq.com", "郑州", new Date(), 0, 0);

        Integer add = userService.add(user);

        System.out.println(add);
    }

    @Test
    void modify() {
        User user = new User(3, "mulun", "123456", "mulun777", '1', "17633333333", "mulun@qq.com", "郑州", new Date(), 0, 0);

        Integer modify = userService.modify(user);

        System.out.println(modify);
    }

    @Test
    void remove() {
        Integer remove = userService.remove(3);

        System.out.println(remove);
    }
}