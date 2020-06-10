package com.example.demo.model.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.dto.CuentasDTO;

public interface CuentasDAO {
	
	public int insert(CuentasDTO e);
	
	public CuentasDTO get(String correo);
	
	public int update(CuentasDTO e);
	
	public int delete(int id_cuenta);
	
	public List<CuentasDTO> lista();
	
	public CuentasDTO findByUserName(String correo);

}
