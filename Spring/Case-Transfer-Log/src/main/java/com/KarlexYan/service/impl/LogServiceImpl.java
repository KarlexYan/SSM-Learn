package com.KarlexYan.service.impl;

import com.KarlexYan.dao.LogDao;
import com.KarlexYan.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    private LogDao logDao;

    @Autowired
    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public void log(String out, String in, Double money) {
        logDao.log("转账操作由" + out + "转出到" + in + ",金额为" + money);
    }
}
