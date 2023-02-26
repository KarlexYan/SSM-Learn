package com.KarlexYan.controller;

import com.KarlexYan.domain.Book;
import com.KarlexYan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return bookService.delete(id);
    }

    @PutMapping
    public boolean update(@RequestBody Book book){
        return bookService.update(book);
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }
}
