package com.karlexyan.service;

import com.karlexyan.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTest {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Test
    public void TestGetById(){
        Book book = bookService.getById(2);
        System.out.println(book);
    }

    @Test
    public void TestGetAll(){
        List<Book> bookList = bookService.getAll();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
