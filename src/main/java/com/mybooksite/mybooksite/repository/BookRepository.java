package com.mybooksite.mybooksite.repository;

import com.mybooksite.mybooksite.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findAll();

    Book findByTome(int tome);

    List<Book> findAllByAuthor(String author);

    Book findByTitle(String title);

}

