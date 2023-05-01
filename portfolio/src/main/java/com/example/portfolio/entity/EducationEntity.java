package com.example.portfolio.entity;

import com.example.portfolio.enums.EducationTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="education")
public class EducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String placeName;
    private String placeLogo;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private EducationTypeEnum educationType;
    private String status;

    @ManyToOne
    @JoinColumn(name = "personId")
    private PersonEntity person;
}
