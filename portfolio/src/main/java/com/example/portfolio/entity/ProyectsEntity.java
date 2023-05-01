package com.example.portfolio.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="proyects")
public class ProyectsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private String proyectUrl;
    private String proyectImg;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="personId")
    private PersonEntity person;
}
