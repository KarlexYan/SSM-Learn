package com.KarlexYan;

import com.KarlexYan.dao.BookDao;
import com.KarlexYan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = ac.getBean("bookDao", BookDao.class);
        System.out.println(bookDao);

        // 如果@Component没定义bean的名字，直接按类型获取bean
        BookService bookService = ac.getBean(BookService.class);
        System.out.println(bookService);
    }
}
