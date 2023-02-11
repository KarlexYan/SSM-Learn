package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNumber ;
    private String databaseName;

    @Override
    public void save() {
        System.out.println("book dao save ..." + databaseName +","+connectionNumber);
    }
    //setter注入需要提供要注入对象的set方法
    public void setConnectionNumber(int connectionNumber) {
        this.connectionNumber = connectionNumber;
    }
    //setter注入需要提供要注入对象的set方法
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
