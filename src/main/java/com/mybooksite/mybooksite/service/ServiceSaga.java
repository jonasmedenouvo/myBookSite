package com.mybooksite.mybooksite.service;

import com.mybooksite.mybooksite.model.Saga;
import com.mybooksite.mybooksite.repository.SagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSaga {

    @Autowired
    SagaRepository sagaRepository;

    public List<Saga> getAllSaga() {
        return sagaRepository.findAll();
    }

    public Saga getSagaById(int id) {

        return sagaRepository.findById(id);
    }
}
