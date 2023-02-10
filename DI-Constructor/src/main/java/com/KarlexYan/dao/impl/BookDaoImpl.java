package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNumber ;
    private String databaseName;

    @Override
    public void save() {
        System.out.println("book dao save ..." + databaseName +","+connectionNumber);
    }

    // 构造器注入
    public BookDaoImpl(int connectionNumber, String databaseName) {
        this.connectionNumber = connectionNumber;
        this.databaseName = databaseName;
    }
}
