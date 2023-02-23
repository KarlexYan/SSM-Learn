package com.KarlexYan;

import com.KarlexYan.config.SpringConfig;
import com.KarlexYan.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = ac.getBean(UserController.class);
        System.out.println(userController);

    }
}
