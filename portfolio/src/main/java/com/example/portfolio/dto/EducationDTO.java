package com.example.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationDTO {
    private Long id;
    private String name;
    private String place_name;
    private String place_logo;
    private Long current_year;
    private String education_type;
}
