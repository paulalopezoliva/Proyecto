package com.example.demo.service;

import java.util.List;
import com.example.demo.model.dto.AlumnosDTO;


public interface AlumnosService {
	public List<AlumnosDTO> findAll();
	public AlumnosDTO getOne(Integer rutalumno);
	public AlumnosDTO save(AlumnosDTO alumnosdto);
	public void delete(AlumnosDTO alumnosdto);
	

}
