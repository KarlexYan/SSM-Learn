package com.karlexyan;

import com.karlexyan.dao.UserDao;
import com.karlexyan.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    public void testGetAll() {
        List<User> userList = userDao.selectList(null);
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
