package com.karlexyan;

import com.karlexyan.dao.BookDao;
import com.karlexyan.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testSelectById(){
        Book book = bookDao.selectById(5);
        System.out.println(book);
    }

}
