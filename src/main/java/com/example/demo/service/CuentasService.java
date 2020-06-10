package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.demo.model.dto.CuentasDTO;

public interface CuentasService {
	public List<CuentasDTO> list();
	public int insert(CuentasDTO cuentasdto);
	public CuentasDTO get_one(String correo);
	public int update(CuentasDTO cuentasdto);
	public int delete(Integer id_cuenta); 
	public CuentasDTO findByUserName(String correo);
	
}
