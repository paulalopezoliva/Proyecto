package com.example.demo.model.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.DemoApplication;
import com.example.demo.model.dto.AlumnosDTO;
import com.example.demo.model.dto.UsersDTO;
@Service
public class UsersDaoImpl implements UsersDAO {
	
	private String insert="INSERT INTO USERS VALUES(?,?,?,?)";
	private String get_one="SELECT * FROM USERS WHERE USERNAME=?";
	private String update="UPDATE TABLA_CUENTAS SET USER_ID=?, USERNAME=?, PASSWORD=?, ENABLE=? WHERE USERNAME=?";
	private String delete="DELETE FROM USERS WHERE USERNAME=?";
	private String list="SELECT * FROM USERS";
	private String get_rol="SELECT * FROM AUTHORITIES WHERE USERNAME=?";
	@Override
	public int insertusuario(UsersDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Autowired
	JdbcTemplate jdbctemplate;
	@Override
	public UsersDTO getusuario(String username) {
		UsersDTO usersdto;
		Object[] args= {"username"};
		try {
			usersdto=jdbctemplate.queryForObject(get_one,args,BeanPropertyRowMapper.newInstance(UsersDTO.class));
			}
		catch(EmptyResultDataAccessException e) {
	    	usersdto=null;
	    	e.printStackTrace();
	    } catch (Exception e) {
	    	usersdto=null;
	    	e.printStackTrace();
	    }
		return usersdto;
	}

	@Override
	public int updateusuario(UsersDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUsuario(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UsersDTO> listusuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertroles(UsersDTO users) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UsersDTO getroles(String username) {

		return null;
	}

	@Override
	public int updateroles(UsersDTO users) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteroles(int id_auth) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<UsersDTO> findByUsername(String username) {
		Object[] args= {username};
		Optional<UsersDTO> userop =null;
		try {
			userop=Optional.of(jdbctemplate.queryForObject(get_one, args,BeanPropertyRowMapper.newInstance(UsersDTO.class)));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return userop;
	}

}
