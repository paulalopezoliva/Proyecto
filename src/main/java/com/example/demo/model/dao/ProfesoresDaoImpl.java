package com.example.demo.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.dto.ProfesoresDTO;

@Repository
@Transactional
public class ProfesoresDaoImpl implements ProfesoresDAO {
	public String listar="SELECT * FROM TABLA_PROFESOR";
	public String get_cursos="SELECT c.curnivel, c.curletra FROM TABLA_PROFESOR B, TABLA_CURSO C WHERE b.rutprofesor=c.rutprofesor AND b.rutprofesor=?";
	
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public int insert(ProfesoresDTO profesoresdto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProfesoresDTO get(Integer rutprofesor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(ProfesoresDTO profesoresdto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id_cuenta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProfesoresDTO> lista() {
		List<ProfesoresDTO> profesoresdto=jdbctemplate.query(listar, BeanPropertyRowMapper.newInstance(ProfesoresDTO.class));
		return profesoresdto;
	}

	@Override
	public ProfesoresDTO listacursos(Integer rutprofesor) {
		Object[] args= {rutprofesor};
		ProfesoresDTO profesoresdto=jdbctemplate.queryForObject(get_cursos,args,BeanPropertyRowMapper.newInstance(ProfesoresDTO.class));
		
		return profesoresdto;
	}

}
