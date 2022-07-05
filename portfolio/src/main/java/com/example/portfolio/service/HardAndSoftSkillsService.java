package com.example.portfolio.service;

import com.example.portfolio.dto.HardAndSoftSkillsDTO;
import com.example.portfolio.dto.ProyectsDTO;

import java.util.List;

public interface HardAndSoftSkillsService {

    List<HardAndSoftSkillsDTO> getAllHass();

    HardAndSoftSkillsDTO saveHass(HardAndSoftSkillsDTO dto);

    void deleteHass(Long id);

}
