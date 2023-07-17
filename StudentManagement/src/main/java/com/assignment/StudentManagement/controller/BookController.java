package com.assignment.StudentManagement.controller;

import com.assignment.StudentManagement.model.Book;
import com.assignment.StudentManagement.model.Course;
import com.assignment.StudentManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    /// post book
    @PostMapping("book")
    public String addBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    // Get All books
    @GetMapping("books")
    public List<Book> getAllBook(){
        return bookService.gatBooks();
    }
}
