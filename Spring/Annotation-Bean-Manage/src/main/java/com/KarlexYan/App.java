package com.KarlexYan;

import com.KarlexYan.config.SpringConfig;
import com.KarlexYan.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = ac.getBean(BookDao.class);
        BookDao bookDao2 = ac.getBean(BookDao.class);
        System.out.println(bookDao1);
        System.out.println(bookDao2);

        ac.close();
    }
}
