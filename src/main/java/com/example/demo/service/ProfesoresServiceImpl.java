package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.dao.ProfesoresDAO;
import com.example.demo.model.dto.ProfesoresDTO;
@Service
public class ProfesoresServiceImpl implements ProfesoresService {

	private ProfesoresDAO profesoresdao;
	
	@Override
	public ProfesoresDTO lista(Integer rutprofesor) {
		return profesoresdao.listacursos(rutprofesor);
	}

	@Override
	public List<ProfesoresDTO> listacompleta() {
		return profesoresdao.lista();
	}

}
