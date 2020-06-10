package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.CuentasDAO;
import com.example.demo.model.dto.CuentasDTO;
@Service
public class CuentasServiceImpl implements CuentasService {
	@Autowired
	private CuentasDAO cuentasdao;
	@Override
	public List<CuentasDTO> list() {
		return cuentasdao.lista();
	}
	@Override
	public int insert(CuentasDTO cuentasdto) {
		return cuentasdao.insert(cuentasdto);
	}

	@Override
	public CuentasDTO get_one(String correo) {
		return cuentasdao.get(correo);
	}

	@Override
	public int update(CuentasDTO cuentasdto) {
		return cuentasdao.update(cuentasdto);
	}

	@Override
	public int delete(Integer id_cuenta) {
		return cuentasdao.delete(id_cuenta);
	}
	@Override
	public CuentasDTO findByUserName(String correo) {
		return cuentasdao.findByUserName(correo);
	}

}
