package com.example.demo.service;

import java.util.List;

import com.example.demo.model.dto.ProfesoresDTO;


public interface ProfesoresService {
	
	public ProfesoresDTO lista(Integer rutprofesor);
	
	public List<ProfesoresDTO>listacompleta();

}
