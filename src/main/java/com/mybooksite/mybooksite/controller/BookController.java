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
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    ServiceBook serviceBook;

    //Get All Book Tomes
    @GetMapping("/books")
    public ResponseEntity getAllBooks(){
        List<Book> books = serviceBook.getAllBooks();
        return new ResponseEntity(books, HttpStatus.OK);
    }

    //Show single Book
    @GetMapping("/book/{tome_Number}")
    public ResponseEntity getBookByTome(@PathVariable(value = "tome_Number")Integer tome){
        Book book = serviceBook.getBookByTome(tome);
        return new ResponseEntity(book, HttpStatus.OK);
    }
    //Show Book by author
    @GetMapping("/book/{author}")
    public ResponseEntity getBookByAuthor(@PathVariable(value = "author")String author){
        Book book = serviceBook.getBookByAuthor(author);
        return new ResponseEntity(book, HttpStatus.OK);
    }
    //Show single Book
    @GetMapping("/book/{title}")
    public ResponseEntity getBookByTitle(@PathVariable(value = "title")String title){
        Book book = serviceBook.getBookByTitle(title);
        return new ResponseEntity(book, HttpStatus.OK);
    }
}
