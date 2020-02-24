package com.mybooksite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybooksite.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

	Author findByLastName(String lastName);

}
