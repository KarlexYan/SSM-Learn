package com.KarlexYan;

import com.KarlexYan.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) ac.getBean("bookDao");

        bookDao.save();
    }
}
