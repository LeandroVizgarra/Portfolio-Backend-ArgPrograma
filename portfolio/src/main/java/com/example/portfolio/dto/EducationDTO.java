package com.example.portfolio.dto;

import com.example.portfolio.enums.EducationTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EducationDTO {
    private Long id;
    private String name;
    private String placeName;
    private String logo;
    private LocalDate date;
    private EducationTypeEnum education_type;
    private String status;
}
