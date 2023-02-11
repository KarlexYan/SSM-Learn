package com.KarlexYan.service.impl;

import com.KarlexYan.dao.BookDao;
import com.KarlexYan.service.BookService;

public class BookServiceImpl implements BookService {
//    private BookDao bookDao = new BookDaoImpl();
//    5.删除业务层中使用new方式创建的dao对象
        private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

//    6.提供对应的setter方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
