package com.example.portfolio.controller;

import com.example.portfolio.dto.ProyectsDTO;
import com.example.portfolio.service.ProyectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyects")
public class ProyectsController {
    @Autowired
    private ProyectsService proyectsService;

    @GetMapping
    public ResponseEntity<List<ProyectsDTO>> getAll(){
        List<ProyectsDTO> dtos = proyectsService.getAllProyects();
        return ResponseEntity.ok().body(dtos);
    }

    @PostMapping
    public ResponseEntity<ProyectsDTO> save(@RequestBody ProyectsDTO dto){

        ProyectsDTO proyectSaved = proyectsService.saveProyects(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(proyectSaved);
    }

    @PutMapping
    public ResponseEntity<ProyectsDTO> update(@RequestBody ProyectsDTO dto){

        ProyectsDTO proyectUpdated = proyectsService.updateProyects(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(proyectUpdated);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.proyectsService.deleteProyect(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
