package com.mybooksite.mybooksite.controller;

import com.mybooksite.mybooksite.model.Book;
import com.mybooksite.mybooksite.service.ServiceBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    ServiceBook serviceBook;

    //Get All Books
    @GetMapping()
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = serviceBook.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    //Show single Book
    @GetMapping("/{tome}")
    public ResponseEntity<Book> getBookByTome(@PathVariable(value = "tome") Integer tome) {
        Book book = serviceBook.getBookByTome(tome);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

}
