package com.KarlexYan.service.impl;

import com.KarlexYan.dao.BookDao;
import com.KarlexYan.dao.UserDao;
import com.KarlexYan.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("book service save ... ");
        bookDao.save();
        userDao.save();
    }
    //setter注入需要提供要注入对象的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    //setter注入需要提供要注入对象的set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
