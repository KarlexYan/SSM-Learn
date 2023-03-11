package com.karlexyan;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.karlexyan.dao.UserDao;
import com.karlexyan.domain.User;
import com.karlexyan.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@SpringBootTest
class MyBatisPlusDqlApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    // 方式一：按条件查询
    @Test
    void testSelectByQuery() {
        // 创建条件构造器
        QueryWrapper wrapper = new QueryWrapper();
        // 设置条件，age小于18的
        wrapper.lt("age", 18);
        // 将构造器放入参数当中查询
        List<User> userList = userDao.selectList(wrapper);
        userList.forEach(user -> System.out.println(user));
    }

    // 方式二：lambda格式按条件查询
    @Test
    void testSelectByLambda() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        // 使用lambda设置条件
        wrapper.lambda().lt(User::getAge, 18);
        List<User> userList = userDao.selectList(wrapper);
        userList.forEach(user -> System.out.println(user));
    }

    // 方式三：使用lambda条件构造器按lambda格式按条件查询
    @Test
    void testSelectByLambdaQueryWrapper() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        // 使用lambda设置条件
        wrapper.lt(User::getAge, 18);
        List<User> userList = userDao.selectList(wrapper);
        userList.forEach(user -> System.out.println(user));
    }

    // 多条件查询
    @Test
    void testSelectByCondition() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        // 并且关系，查询小于30岁并且大于18岁
//        wrapper.lt(User::getAge,30).gt(User::getAge,10);

        // 或者关系，查询小于10岁或者大于30岁
        wrapper.lt(User::getAge, 10).or().gt(User::getAge, 30);
        List<User> userList = userDao.selectList(wrapper);
        userList.forEach(user -> System.out.println(user));
    }


    // null判定
    @Test
    void testNullDetermination() {
        UserQuery userQuery = new UserQuery();
        userQuery.setAge(10);
        userQuery.setAge2(30);

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper();
        // 先判定第一个参数是否为true，如果为true连接当前条件
        wrapper.lt(null != userQuery.getAge2(), User::getAge, userQuery.getAge2())
                .gt(null != userQuery.getAge(), User::getAge, userQuery.getAge());
        List<User> userList = userDao.selectList(wrapper);
        userList.forEach(user -> System.out.println(user));
    }

    // 查询投影
    @Test
    void testProjection(){
        // 查询结果包含模型类中部分属性
//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
//        wrapper.select(User::getName,User::getPassword);
//        List<User> userList = userDao.selectList(wrapper);
//        userList.forEach(user -> System.out.println(user));

        // 查询结果包含模型类中未定义的属性
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("count(*) as nums,tel");
        wrapper.groupBy("tel");
        List<Map<String, Object>> maps = userDao.selectMaps(wrapper);
        System.out.println(maps);
    }

    // 查询条件设置
    @Test
    void testSelectByUserQuery(){
//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
//        // 等同于 =
//        wrapper.eq(User::getName,"Jerry").eq(User::getPassword,"jerry");
//        User user = userDao.selectOne(wrapper);
//        System.out.println(user);

//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
//        // 范围查询 lt le gt ge eq between
//        wrapper.between(User::getAge,10,30);
//        List<User> users = userDao.selectList(wrapper);
//        users.forEach(user -> System.out.println(user));

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        // 模糊匹配 like
        wrapper.like(User::getName,"J");
        List<User> userList = userDao.selectList(wrapper);
        userList.forEach(user -> System.out.println(user));
    }
}
