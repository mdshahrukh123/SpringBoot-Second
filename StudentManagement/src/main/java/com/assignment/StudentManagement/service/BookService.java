package com.assignment.StudentManagement.service;

import com.assignment.StudentManagement.model.Book;
import com.assignment.StudentManagement.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String createBook(Book book) {
        bookRepo.save(book);
        return "Book Added successfully.....!!!!!";
    }


    public List<Book> gatBooks() {
        return bookRepo.findAll();
    }
}
