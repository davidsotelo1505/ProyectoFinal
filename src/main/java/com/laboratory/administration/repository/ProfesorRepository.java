package com.laboratory.administration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laboratory.administration.entity.Profesor;

public interface ProfesorRepository extends JpaRepository <Profesor, Long> {

}
