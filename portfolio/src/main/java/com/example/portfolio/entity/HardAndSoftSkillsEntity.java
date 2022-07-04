package com.example.portfolio.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class HardAndSoftSkillsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Long progress;

    @ManyToOne
    @JoinColumn(name="personId")
    private PersonEntity person;
}
