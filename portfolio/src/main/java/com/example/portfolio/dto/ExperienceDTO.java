package com.example.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ExperienceDTO {
    private Long id;
    private String company;
    private String jobTittle;
    private String jobLogo;
    private String description;
    private LocalDate startDate;
}
