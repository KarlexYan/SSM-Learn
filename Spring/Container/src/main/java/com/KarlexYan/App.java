package com.KarlexYan;

import com.KarlexYan.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 创建容器
        // 1. 加载类路径下的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 从文件系统下加载配置文件
//        ApplicationContext ac = new FileSystemXmlApplicationContext("Container/src/main/resources/applicationContext.xml");
        // 3. 加载多个配置文件
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml","bean2.xml");

        // 获取bean
        // 1. 使用bean名称获取
//        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        // 2. 使用bean名称并指定类型 可以省去强转的步骤
//        BookDao bookDao = ac.getBean("bookDao", BookDao.class);
        // 3. 使用bean类型获取
        BookDao bookDao = ac.getBean(BookDao.class);

        bookDao.save();
    }
}
