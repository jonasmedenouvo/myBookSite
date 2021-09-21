package com.mybooksite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybooksite.model.Author;
import com.mybooksite.service.AuthorService;
import com.mybooksite.service.exceptions.NonExistantAuthorException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@GetMapping
	public ResponseEntity<List<Author>> getAllAuthors() {
		List<Author> authors = authorService.getAllAuthors();
		return new ResponseEntity<>(authors, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Author> getAuthorByID(@PathVariable(value = "id") Integer id)
			throws NonExistantAuthorException {
		var author = authorService.getAuthorById(id);
		return new ResponseEntity<>(author, HttpStatus.OK);
	}

}
