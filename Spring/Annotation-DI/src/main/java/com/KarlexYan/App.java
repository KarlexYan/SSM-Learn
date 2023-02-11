package com.KarlexYan;

import com.KarlexYan.config.SpringConfig;
import com.KarlexYan.dao.BookDao;
import com.KarlexYan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ac.getBean(BookService.class);
        bookService.save();
    }
}
