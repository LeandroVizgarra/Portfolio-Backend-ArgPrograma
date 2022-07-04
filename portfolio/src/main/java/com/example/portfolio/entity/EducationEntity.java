package com.example.portfolio.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class EducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String place_name;
    private String place_logo;
    private Long current_year;
    private String education_type;

    @ManyToOne
    @JoinColumn(name = "personId")
    private PersonEntity person;
}
