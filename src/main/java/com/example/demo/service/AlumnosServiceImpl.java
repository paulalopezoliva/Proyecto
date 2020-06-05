package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.AlumnosDTO;
import com.example.demo.repository.AlumnosRepository;

@Service
public class AlumnosServiceImpl implements AlumnosService {
	
	@Autowired
	AlumnosRepository alumnosrepository;

	public List<AlumnosDTO> findAll() {
		return alumnosrepository.findAll();
	}
	
	public AlumnosDTO getOne(Integer rutalumno) {
		return alumnosrepository.getOne(rutalumno);
		
	}
	public void delete(AlumnosDTO alumnosdto) {
		alumnosrepository.delete(alumnosdto);

	}
	
	public AlumnosDTO save(AlumnosDTO alumnosdto) {
		return alumnosrepository.save(alumnosdto);
	}

}
