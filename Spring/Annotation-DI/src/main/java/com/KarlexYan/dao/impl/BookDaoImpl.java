package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ... ");
    }
}
