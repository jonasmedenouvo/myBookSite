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

    //Get All Books
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = serviceBook.getAllBooks();
        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
    }

    //Show single Book
    @GetMapping("/books/{tome}")
    public ResponseEntity<Book> getBookByTome(@PathVariable(value = "tome") Integer tome) {
        Book book = serviceBook.getBookByTome(tome);
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }

    //Show single Book
    //@RequestMapping(value = "/books/{title}", method = RequestMethod.GET)
 /*   @GetMapping("/book/{title}")
    public ResponseEntity getBookByTitle(@PathVariable(value = "title") String title) {
        Book bookByTitle = serviceBook.getBookByTitle(title);
        return new ResponseEntity(bookByTitle, HttpStatus.OK);
    }*/

//    //Show Book by author
//    @GetMapping("/authors/{author}")
//    //@RequestMapping(method = RequestMethod.GET)
//    public ResponseEntity<List<Book>> getBooksByAuthor(@PathVariable(value = "author") String author) {
//        List<Book> bookByAuthor = serviceBook.getBooksByAuthor(author);
//        return new ResponseEntity<List<Book>>(bookByAuthor, HttpStatus.OK);
//    }

}
