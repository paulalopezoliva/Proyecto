package com.example.demo.model.dao;

import java.util.List;

import com.example.demo.model.dto.AlumnosDTO;
import org.springframework.beans.factory.annotation.Autowired;

public interface AlumnosInterface {

	List<AlumnosDTO> lista();
	
	void insert(Integer rutalumno);
	
	void insert(AlumnosDTO e);
	
	void update(AlumnosDTO e);
	
	void delete(Integer rutalumno);
}
