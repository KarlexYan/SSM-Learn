package com.KarlexYan.service.impl;

import com.KarlexYan.dao.AccountDao;
import com.KarlexYan.service.AccountService;
import com.KarlexYan.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private LogService logService;

    @Autowired
    public void setLogService(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void transfer(String out, String in, Double money) {

        try {
            accountDao.outMoney(out,money);
            // 模拟异常
            int i = 1/0;
            accountDao.inMoney(in,money);
        } finally {
            // 无论成功失败都执行记录日志方法
            logService.log(out,in,money);
        }
    }
}
