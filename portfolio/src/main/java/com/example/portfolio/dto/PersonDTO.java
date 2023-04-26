package com.example.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonDTO {
    private Long id;
    private String name;
    private String about_me;
    private String country;
    private String image;

    private List<EducationDTO> education;
    private List<ExperienceDTO> experience;
    private List<HardAndSoftSkillsDTO> skills;
    private List<ProyectsDTO> proyects;
}
