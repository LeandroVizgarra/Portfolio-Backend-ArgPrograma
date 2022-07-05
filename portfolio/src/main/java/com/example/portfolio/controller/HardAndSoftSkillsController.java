package com.example.portfolio.controller;

import com.example.portfolio.dto.HardAndSoftSkillsDTO;
import com.example.portfolio.service.HardAndSoftSkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hass")
public class HardAndSoftSkillsController {

    @Autowired
    private HardAndSoftSkillsService hardAndSoftSkillsService;


    @GetMapping
    public ResponseEntity<List<HardAndSoftSkillsDTO>> getAll(){
        List<HardAndSoftSkillsDTO> dtos = hardAndSoftSkillsService.getAllHass();
        return ResponseEntity.ok().body(dtos);
    }

    @PostMapping
    public ResponseEntity<HardAndSoftSkillsDTO> save(@RequestBody HardAndSoftSkillsDTO dto){
        HardAndSoftSkillsDTO hassSaved = hardAndSoftSkillsService.saveHass(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(hassSaved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.hardAndSoftSkillsService.deleteHass(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
