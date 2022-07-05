package com.example.portfolio.mapper.entity;

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
}
