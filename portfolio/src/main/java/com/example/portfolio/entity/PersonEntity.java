package com.example.portfolio.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long personId;
    private String name;
    private String about_me;
    private String country;
    private String image;
    @OneToMany
    private List<EducationEntity> educationEntities;
    @OneToMany
    private List<ExperienceEntity> experiences;
    @OneToMany
    private List<HardAndSoftSkillsEntity> skills;
    @OneToMany
    private List<ProyectsEntity> proyects;

    //TODO Enalzar tablas
    //TODO probar endpoints
    //TODO pasar por IA correcciones
    //TODO Rehacer la BBDD
}
