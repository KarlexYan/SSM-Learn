package com.KarlexYan;

import com.KarlexYan.dao.BookDao;
import com.KarlexYan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        // 3.获取IoC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 4.获取bean
//        BookDao bookDao = (BookDao) ac.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) ac.getBean("bookService");
        bookService.save();
    }
}
