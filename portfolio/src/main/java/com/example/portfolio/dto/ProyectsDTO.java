package com.example.portfolio.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter

public class ProyectsDTO {
    private Long id;
    private String name;
    private String description;
    private String proyectUrl;
    private String proyectImg;
    private LocalDate date;
}
