package com.KarlexYan;

import com.KarlexYan.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) ac.getBean("dataSource");
//        System.out.println(dataSource);

        // c3p0需要导入mysql-connector-java
//        DataSource c3p0 = (DataSource) ac.getBean("c3p0DataSource");
//        System.out.println(c3p0);

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        bookDao.save();
    }
}
