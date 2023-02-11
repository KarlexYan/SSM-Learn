package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
//    @Value("KarlexYan")
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save ... " + name);
    }
}
