package com.example.demo.model.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.model.dto.AlumnosDTO;

public class AlumnosDAO implements AlumnosInterface {

	public String insert="INSERT INTO TABLA_ALUMNO VALUES RUTALUMNO=?, RUTDIGITOALUMNO=?, NOMBREALUMNO=?, ALUMNAPELLIDOPAT=?, ALUMNAPELLIDOMAT=?, ALUMNFECHANACIM=?, ALUMNDIRECCION=?, ALUMNTELEFONO=?, ID_CURSO=?";
	public String update="UPDATE TABLA_ALUMNO SET RUTALUMNO=?, RUTDIGITOALUMNO=?, NOMBREALUMNO=?, ALUMNAPELLIDOPAT=?, ALUMNAPELLIDOMAT=?, ALUMNFECHANACIM=?, ALUMNDIRECCION=?, ALUMNTELEFONO=?, ID_CURSO=?";
	public String delete="DELETE FROM TABLA_ALUMNO WHERE RUTALUMNO=?";
	public String get_one="SELECT * FROM TABLA_ALUMNO WHERE RUTALUMNO=?";
	public String get_all="SELECT * FROM TABLA_ALUMNO";
	
	public AlumnosDAO() {
	}
	@Autowired
    private JdbcTemplate jdbctemplate;
	
	@Override
	public List<AlumnosDTO> lista() {
		List<AlumnosDTO> listaalumno = jdbctemplate.query(get_all, BeanPropertyRowMapper.newInstance(AlumnosDTO.class));
		return listaalumno;
	}

	@Override
	public void insert(Integer rutalumno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(AlumnosDTO e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(AlumnosDTO e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer rutalumno) {
		// TODO Auto-generated method stub

	}

}
