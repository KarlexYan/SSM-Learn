package com.karlexyan;

import com.karlexyan.dao.UserDao;
import com.karlexyan.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisPlusDmlApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        User user = new User();
        user.setName("KarlexYan");
        user.setPassword("123456");
        user.setAge(25);
        user.setTel("1145141010985");
        userDao.insert(user);
    }

    @Test
    void testDelete(){
        userDao.deleteById(1634412037491101697L);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("Tommy");
        user.setPassword("tommy");
        userDao.updateById(user);
    }
}
