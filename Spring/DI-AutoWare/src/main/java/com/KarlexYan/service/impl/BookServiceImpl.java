package com.KarlexYan.service.impl;

import com.KarlexYan.dao.BookDao;
import com.KarlexYan.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    // 自动装配需要提供setter方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
