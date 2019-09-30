package com.laboratory.administration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laboratory.administration.entity.Profesor;
import com.laboratory.administration.service.ProfesorService;

@RestController
public class ProfesorController {
	
	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping("/list")
	public List<Profesor> getList(){
		return profesorService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Profesor getById(@PathVariable Long id) {
		return profesorService.getById(id);
	}
	
	

}
