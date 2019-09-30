package com.laboratory.administration.service;

import java.util.List;

import com.laboratory.administration.entity.Profesor;


public interface ProfesorService {
	
	public List<Profesor> getAllList();
	public Profesor getById(Long id);
}
