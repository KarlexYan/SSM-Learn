package com.KarlexYan.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    /*
    * 转账操作
    * @Param out 转账方
    * @Param in  收款方
    * @Param money  转账金额
    * */


    //配置当前接口方法具有事务
    @Transactional
    public void transfer(String out,String in,Double money);
}
