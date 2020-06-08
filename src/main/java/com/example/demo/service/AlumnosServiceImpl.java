package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.AlumnosDAO;
import com.example.demo.model.dto.AlumnosDTO;

@Service
public class AlumnosServiceImpl implements AlumnosService {
	
	@Autowired
	private AlumnosDAO alumnosdao;

	public List<AlumnosDTO> listar() {
		return alumnosdao.lista();
	}
	
	public int update(AlumnosDTO e) {
		return alumnosdao.update(e);
		
	}
	
	@Override
	public int insert(AlumnosDTO e) {
		return alumnosdao.insert(e);
		
	}

	@Override
	public AlumnosDTO getOne(Integer rutalumno) {
		return alumnosdao.getOne(rutalumno);
	}

	
	public int delete(Integer rutalumno) {
		return alumnosdao.delete(rutalumno);

	}

}
