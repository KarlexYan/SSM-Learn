package com.KarlexYan.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForColletction {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        bookDao.save();
    }
}
