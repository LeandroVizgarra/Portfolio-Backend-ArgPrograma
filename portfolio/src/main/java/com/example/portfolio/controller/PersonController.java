package com.example.portfolio.controller;

import com.example.portfolio.dto.PersonDTO;
import com.example.portfolio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/person")
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

    // TODO JWT
    // TODO Test DB in CleverCloud
    // TODO Test API in Heroku
}
