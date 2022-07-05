package com.example.portfolio.repository;

import com.example.portfolio.mapper.entity.ProyectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectsRepository extends JpaRepository<ProyectsEntity,Long> {

}
