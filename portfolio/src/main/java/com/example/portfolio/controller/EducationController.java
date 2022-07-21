package com.example.portfolio.controller;

import com.example.portfolio.dto.EducationDTO;
import com.example.portfolio.service.EducationService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController {

    @Autowired
    private EducationService educationService;

    @GetMapping
    public ResponseEntity<List<EducationDTO>> getAllEducation(){
        List<EducationDTO> educationDTOS = educationService.getAllEducation();
        return ResponseEntity.ok().body(educationDTOS);
    }

    @PostMapping
    public ResponseEntity<EducationDTO> saveEducation(EducationDTO dto){

        EducationDTO educationSave = educationService.saveEducation(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(educationSave);

    }

    @PutMapping
    public ResponseEntity<EducationDTO> updateEducation(EducationDTO dto){

        EducationDTO educationUpdate = educationService.updateEducation(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(educationUpdate);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteEducation(@RequestParam Long id){
        educationService.deleteEducation(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



}
