package com.beike.otc;

import com.beike.otc.mapper.UserLoginMapper;
import com.beike.otc.pojo.UserLogin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
public class DemoTests {
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Autowired
    UserLoginMapper userLoginMapper;
    @Test
    public void toTest(){
        List<UserLogin> userLogins = userLoginMapper.queryAll();
//        userLogins.forEach(e-> System.out.println(e));
    }
}
