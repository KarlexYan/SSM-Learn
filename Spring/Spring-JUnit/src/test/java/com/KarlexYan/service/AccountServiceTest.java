package com.KarlexYan.service;

import com.KarlexYan.config.SpringConfig;
import com.KarlexYan.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// 使用Spring整合Junit专用的类加载器
@RunWith(SpringJUnit4ClassRunner.class)
// 上下文配置
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        Account account = accountService.findById(2);
        System.out.println(account);
    }
    @Test
    public void testFindAll(){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
