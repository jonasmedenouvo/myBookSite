package com.mybooksite.mybooksite.controller;

import com.mybooksite.mybooksite.model.Saga;
import com.mybooksite.mybooksite.service.ServiceBook;
import com.mybooksite.mybooksite.service.ServiceSaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class SagaController {

    @Autowired
    ServiceSaga serviceSaga;

    //Get All Sagas
    @GetMapping("/sagas")
    public ResponseEntity getAllSaga() {
        List<Saga> sagas = serviceSaga.getAllSaga();
        return new ResponseEntity(sagas, HttpStatus.OK);
    }

}
