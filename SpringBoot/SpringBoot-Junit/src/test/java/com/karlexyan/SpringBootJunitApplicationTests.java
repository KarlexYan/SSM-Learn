package com.karlexyan;

import com.karlexyan.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJunitApplicationTests {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testSave(){
        bookService.save();
    }

}
