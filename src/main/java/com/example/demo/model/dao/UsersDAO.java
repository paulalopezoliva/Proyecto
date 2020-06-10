package com.example.demo.model.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.dto.UsersDTO;

public interface UsersDAO {
	
	public int insertusuario(UsersDTO user);
	public UsersDTO getusuario(String username);
	public int updateusuario(UsersDTO user);
	public int deleteUsuario(String username);
	public List<UsersDTO> listusuario();
	
	 public int insertroles(UsersDTO users);
	 public UsersDTO getroles(String username);
	 public int updateroles(UsersDTO users);
	 public int deleteroles(int id_auth);
	 public Optional<UsersDTO> findByUsername(String username);
	
	

}
