package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        // 模拟校验
        return password.equals("root");
    }
}
