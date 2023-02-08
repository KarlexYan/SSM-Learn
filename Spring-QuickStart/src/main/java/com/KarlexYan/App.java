package com.KarlexYan;

import com.KarlexYan.service.BookService;
import com.KarlexYan.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
