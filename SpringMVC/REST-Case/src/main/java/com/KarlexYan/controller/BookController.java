package com.KarlexYan.controller;

import com.KarlexYan.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ==> " + book);
        return "{'module' : 'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        System.out.println("book getAll is running ...");
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("计算机", "SpringMVC入门教程", "小试牛刀");
        Book book2 = new Book("计算机","SpringMVC实战教程","一代宗师");
        Book book3 = new Book("计算机丛书","SpringMVC实战教程进阶","一代宗师呕心创作");
        bookList.add(book1);bookList.add(book2);bookList.add(book3);
        return bookList;
    }
}
