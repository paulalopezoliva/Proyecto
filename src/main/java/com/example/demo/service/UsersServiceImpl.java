package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.UsersDAO;
import com.example.demo.model.dto.UsersDTO;


@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersDAO userdao;
	@Override
	public UsersDTO findByUserName(String username) {
		return userdao.getusuario(username);
	}
	@Override
	public Optional<UsersDTO> usooptional(UsersDTO usersdto) {
		return null;
	}

}
