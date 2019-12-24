package com.mybooksite.mybooksite.repository;

import com.mybooksite.mybooksite.model.Saga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SagaRepository extends JpaRepository<Saga,Integer> {

    List<Saga> findAll();

    Saga findById(int id);

    Saga findAllByAuthor(String author);

    Saga findByTitle(String title);
}
