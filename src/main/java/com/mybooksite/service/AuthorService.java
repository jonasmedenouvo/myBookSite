package com.mybooksite.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybooksite.model.Author;
import com.mybooksite.repository.AuthorRepository;
import com.mybooksite.service.exceptions.NonExistantAuthorException;

@Service
public class AuthorService {

	@Autowired
	AuthorRepository authorRepository;

	public List<Author> getAllAuthors() {

		return authorRepository.findAll();
	}

	public Author getAuthorById(int id) throws NonExistantAuthorException {
		Optional<Author> optionalAuthor = authorRepository.findById(id);

		if (!optionalAuthor.isPresent()) {
			throw new NonExistantAuthorException("L'auteur dont l'ID est: " + id + " n'existe pas !");
		}
		return optionalAuthor.get();
	}

	public Author getAuthorByLastName(String lastName) {
		return authorRepository.findByLastName(lastName);
	}
}
