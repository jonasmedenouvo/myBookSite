package com.mybooksite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybooksite.model.Book;
import com.mybooksite.model.enums.Genre;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	Book findByGenre(Genre genre);

	Book findByTitle(String title);

}
