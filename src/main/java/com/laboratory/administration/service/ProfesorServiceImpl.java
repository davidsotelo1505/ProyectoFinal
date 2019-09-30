package com.laboratory.administration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratory.administration.entity.Profesor;
import com.laboratory.administration.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	
	@Autowired
	private ProfesorRepository profesorRepository;

	@Override
	public List<Profesor> getAllList() {
		
		return profesorRepository.findAll();
	}

	@Override
	public Profesor getById(Long id) {
		
		return profesorRepository.findById(id).get();
	}
	

}
