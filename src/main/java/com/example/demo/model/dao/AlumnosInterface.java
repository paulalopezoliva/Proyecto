package com.example.demo.model.dao;

import java.util.List;

import com.example.demo.model.dto.AlumnosDTO;
import org.springframework.beans.factory.annotation.Autowired;

public interface AlumnosInterface {

	List<AlumnosDTO> lista();
	
	int update(AlumnosDTO e);
	
	int insert(AlumnosDTO e);
	
	AlumnosDTO getOne(Integer rutalumno);
	
	int delete(Integer rutalumno);
}
