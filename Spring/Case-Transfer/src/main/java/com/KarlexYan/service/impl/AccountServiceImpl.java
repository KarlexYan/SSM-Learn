package com.KarlexYan.service.impl;

import com.KarlexYan.dao.AccountDao;
import com.KarlexYan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        // 转出业务
        accountDao.outMoney(out,money);
        // 模拟异常，测试是否触发事务回滚
//        int i = 1/0;
        // 转入业务
        accountDao.inMoney(in,money);
    }
}
