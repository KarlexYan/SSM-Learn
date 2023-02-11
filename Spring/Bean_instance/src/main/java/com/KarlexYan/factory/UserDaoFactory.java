package com.KarlexYan.factory;

import com.KarlexYan.dao.UserDao;
import com.KarlexYan.dao.impl.UserDaoImpl;

//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
