package com.example.portfolio.controller;

import com.example.portfolio.dto.PersonDTO;
import com.example.portfolio.service.PersonService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO dto){
        PersonDTO personSaved = personService.savePerson(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(personSaved);

    }

    @GetMapping
    public ResponseEntity<List<PersonDTO>> getAll(){
        List<PersonDTO> person = personService.getAllPerson();
        return ResponseEntity.ok().body(person);
    }

    // TODO All controllers
    // TODO create CRUD
    // TODO Test CRUD
    // TODO JWT
    // TODO Test Endpoints
    // TODO Test DB in CleverCloud
    // TODO Test API in Heroku
}
