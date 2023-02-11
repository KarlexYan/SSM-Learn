package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
// @Scope 定义bean作用范围 非单例不能执行@PreDestroy
//@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ... ");
    }
    // 需要导入依赖javax.annotation-api
    @PostConstruct
    public void init(){
        System.out.println("init..");
    }
    // 需要导入依赖javax.annotation-api
    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
