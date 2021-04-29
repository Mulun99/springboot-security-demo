package com.mulun;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringbootSecurityDemoApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
        System.out.println("hello git");
        System.out.println("hello git3");
        System.out.println("hello git4");
        System.out.println("hot-fix test!");
        System.out.println("master test");
        System.out.println("github test");
        System.out.println("github test2");
        System.out.println("github test3");
    }

}
