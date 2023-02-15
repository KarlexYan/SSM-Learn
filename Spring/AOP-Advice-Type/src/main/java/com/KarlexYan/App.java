package com.KarlexYan;

import com.KarlexYan.config.SpringConfig;
import com.KarlexYan.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = ac.getBean(BookDao.class);
        int num = bookDao.select();
        System.out.println(num);
    }
}
