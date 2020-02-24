package com.mybooksite.service;

import com.mybooksite.model.Book;
import com.mybooksite.model.enums.Genre;
import com.mybooksite.repository.BookRepository;
import com.mybooksite.service.exceptions.NonExistantBookException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceBook {
	@Autowired
	BookRepository bookRepository;

	public List<Book> getAllBooks() {

		return bookRepository.findAll();
	}

	public Book getBookByTome(int id) throws NonExistantBookException {
		Optional<Book> optionnalBook = bookRepository.findById(id);
		if (!optionnalBook.isPresent()) {
			throw new NonExistantBookException("L'id " + id + " ne correspond à aucun livre !");
		}
		return optionnalBook.get();
	}

	public Book getBookByGenre(Genre genre) {

		return bookRepository.findByGenre(genre);
	}

	public Book getBookByTitle(String title) {

		return bookRepository.findByTitle(title);
	}

}
