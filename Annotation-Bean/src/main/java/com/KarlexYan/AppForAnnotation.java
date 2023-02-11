package com.KarlexYan;

import com.KarlexYan.config.SpringConfig;
import com.KarlexYan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        // 纯注解开发，不用再读取applicationContext.xml
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ac.getBean(BookService.class);
        System.out.println(bookService);


    }
}
