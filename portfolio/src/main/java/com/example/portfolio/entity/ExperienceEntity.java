package com.example.portfolio.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="experience")
public class ExperienceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String job_name;
    private String job_tittle;
    private String image;
    private String tasks;

    @ManyToOne
    @JoinColumn(name="personId")
    private PersonEntity person;

}


