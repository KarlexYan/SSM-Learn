package com.KarlexYan.service.impl;

import com.KarlexYan.dao.BookDao;
import com.KarlexYan.dao.impl.BookDaoImpl;
import com.KarlexYan.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();


    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
