package com.example.portfolio.service;

import com.example.portfolio.dto.EducationDTO;

import java.util.List;

public interface EducationService {

    EducationDTO saveEducation(EducationDTO dto);

    EducationDTO updateEducation(EducationDTO dto);

    void deleteEducation(Long id);

    List<EducationDTO> getAllEducation();
}
