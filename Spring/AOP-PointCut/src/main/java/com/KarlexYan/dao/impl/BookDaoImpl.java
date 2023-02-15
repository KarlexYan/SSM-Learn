package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
//        // 记录程序当前执行时间
//        long startTime = System.currentTimeMillis();
//        // 业务执行一万次
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("book dao save ...");
//        }
//        // 记录程序当前执行时间
//        long endTime = System.currentTimeMillis();
//        // 计算时间差
//        long totalTime = endTime - startTime;
//        System.out.println("执行消耗时间："+totalTime+"ms");
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save");
    }

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }

    @Override
    public void delete() {
        System.out.println("book dao delete ...");
    }

    @Override
    public void select() {
        System.out.println("book dao select ...");
    }


}
