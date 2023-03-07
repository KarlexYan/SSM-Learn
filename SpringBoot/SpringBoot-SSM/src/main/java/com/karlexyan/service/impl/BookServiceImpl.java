package com.karlexyan.service.impl;

import com.karlexyan.controller.Code;
import com.karlexyan.dao.BookDao;
import com.karlexyan.domain.Book;
import com.karlexyan.exception.BusinessException;
import com.karlexyan.exception.SystemException;
import com.karlexyan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book getById(Integer id) {
        // 模拟业务异常，包装成自定义异常
        if (id == 1) {
            throw new BusinessException("非法操作", Code.BUSINESS_ERR);
        }
        // 模拟系统异常，将可能出现的异常进行包装，转换成自定义异常
//        try{
//            int i = 1/0;
//        }catch (Exception e){
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
//        }
        return bookDao.getById(id);
    }
}
