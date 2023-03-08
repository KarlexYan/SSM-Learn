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

    @Test
    public void testGetById(){
        User user = userDao.selectById(1);
        System.out.println(user);
    }

    @Test
    public void testSave(){
        User user  = new User();
        user.setName("zhangsan");
        user.setPassword("123456");
        user.setAge(23);
        user.setTel("china");
        int insert = userDao.insert(user);
        if(insert>0){
            System.out.println("创建成功");
        }
    }

    @Test
    public void testDeleteById(){
        int i = userDao.deleteById(1633372735890104322L);
        if(i>0){
            System.out.println("删除成功");
        }
    }

    @Test
    public void testUpdateById(){
        User user  = new User();
        user.setId(1L);
        user.setName("Tommy");
        int i = userDao.updateById(user);
        if(i>0){
            System.out.println("修改成功");
        }
    }
}
