package com.KarlexYan.service;

import com.KarlexYan.dao.LogDao;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {
    //propagation设置事务属性：传播行为设置为当前操作需要新事务 Propagation.REQUIRES_NEW
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String out,String in,Double money);
}
