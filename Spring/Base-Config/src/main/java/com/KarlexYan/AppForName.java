package com.KarlexYan;

import com.KarlexYan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) ac.getBean("bookService");

        bookService.save();
    }
}
