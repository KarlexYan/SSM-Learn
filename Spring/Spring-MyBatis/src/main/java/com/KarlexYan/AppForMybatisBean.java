package com.KarlexYan;


import com.KarlexYan.config.SpringConfig;
import com.KarlexYan.domain.Account;
import com.KarlexYan.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForMybatisBean {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ac.getBean(AccountService.class);
        Account account = accountService.findById(1);
        System.out.println(account);
    }
}
