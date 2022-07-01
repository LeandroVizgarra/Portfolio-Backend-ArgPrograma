package com.example.portfolio.service;

import com.example.portfolio.dto.ProyectsDTO;

import java.util.List;

public interface ProyectsService {

    List<ProyectsDTO> getAllProyects();

    ProyectsDTO saveProyects(ProyectsDTO dto);
}
