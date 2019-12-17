package com.mybooksite.mybooksite.service;

import com.mybooksite.mybooksite.model.Book;
import com.mybooksite.mybooksite.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBook {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookByTome(int tome) {
        return bookRepository.findByTome(tome);
    }

    public Book getBookByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public Book getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

}
