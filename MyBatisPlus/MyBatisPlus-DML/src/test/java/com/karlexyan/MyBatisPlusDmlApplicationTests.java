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
    void testSave() {
        User user = new User();
        user.setName("KarlexYan");
        user.setPassword("123456");
        user.setAge(25);
        user.setTel("1145141010985");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
        userDao.deleteById(1634412037491101697L);
        //删除指定多条数据
//        List<Long> list = new ArrayList<>();
//        list.add(1402551342481838081L);
//        list.add(1402553134049501186L);
//        list.add(1402553619611430913L);
//        userDao.deleteBatchIds(list);
        //查询指定多条数据
//        List<Long> list = new ArrayList<>();
//        list.add(1L);
//        list.add(3L);
//        list.add(4L);
//        userDao.selectBatchIds(list);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setId(1L);
        user.setName("Tommy");
        user.setPassword("tommy");
        userDao.updateById(user);

        //        User user = new User();
//        user.setId(3L);
//        user.setName("Jock666");
//        user.setVersion(1);
//        userDao.updateById(user);

//        //1.先通过要修改的数据id将当前数据查询出来
//        User user = userDao.selectById(3L);
//        //2.将要修改的属性逐一设置进去
//        user.setName("Jock888");
//        userDao.updateById(user);
    }
}
