package com.example.demo.model.dao;

import java.util.List;

import com.example.demo.model.dto.ProfesoresDTO;

public interface ProfesoresDAO {
	
	public int insert(ProfesoresDTO profesoresdto);
	
	public ProfesoresDTO get(Integer rutprofesor);
	
	public int update(ProfesoresDTO profesoresdto);
	
	public int delete(int id_cuenta);
	
	public List<ProfesoresDTO> lista();
	
	public ProfesoresDTO listacursos(Integer rutprofesor);

}
