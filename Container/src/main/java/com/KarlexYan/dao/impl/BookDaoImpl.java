package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("constructor");
    }

    @Override
    public void save() {
        System.out.println("book dao save... ");
    }
}
