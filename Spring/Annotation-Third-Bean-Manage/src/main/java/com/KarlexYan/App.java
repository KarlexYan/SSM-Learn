package com.KarlexYan;

import com.KarlexYan.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = ac.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
