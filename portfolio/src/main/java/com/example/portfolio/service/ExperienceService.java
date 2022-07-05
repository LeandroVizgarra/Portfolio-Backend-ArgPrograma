package com.example.portfolio.service;

import com.example.portfolio.dto.ExperienceDTO;

import java.util.List;

public interface ExperienceService {

    List<ExperienceDTO> getAllExperience();

    ExperienceDTO saveExperience(ExperienceDTO dto);

    void deleteExperience(Long id);
}
