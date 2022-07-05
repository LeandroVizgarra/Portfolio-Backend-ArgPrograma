package com.example.portfolio.repository;

import com.example.portfolio.mapper.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity,Long> {
}
