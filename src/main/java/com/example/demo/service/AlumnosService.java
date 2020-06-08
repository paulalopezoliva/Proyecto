package com.example.demo.service;

import java.util.List;
import com.example.demo.model.dto.AlumnosDTO;


public interface AlumnosService {
	public List<AlumnosDTO> listar();
	public int insert(AlumnosDTO alumnosdto);
	public AlumnosDTO getOne(Integer rutalumno);
	public int update(AlumnosDTO alumnosdto);
	public int delete(Integer rutalumno);
	
	

}
