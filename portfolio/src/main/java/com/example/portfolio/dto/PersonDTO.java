package com.example.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {
    private Long id;
    private String name;
    private String about_me;
    private String country;
    private String image;
}
