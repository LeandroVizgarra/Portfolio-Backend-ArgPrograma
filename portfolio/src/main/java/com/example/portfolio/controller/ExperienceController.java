package com.example.portfolio.controller;

import com.example.portfolio.dto.ExperienceDTO;
import com.example.portfolio.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @GetMapping
    public ResponseEntity<List<ExperienceDTO>> getAllExperience(){
        List<ExperienceDTO> experiences = experienceService.getAllExperience();
        return ResponseEntity.ok().body(experiences);
    }

    @PostMapping
    public ResponseEntity<ExperienceDTO> save(@RequestBody ExperienceDTO dto){
        ExperienceDTO experienceSave = experienceService.saveExperience(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(experienceSave);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.experienceService.deleteExperience(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
