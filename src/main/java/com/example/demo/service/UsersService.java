package com.example.demo.service;



import java.util.Optional;

import com.example.demo.model.dto.UsersDTO;

public interface UsersService {

	public UsersDTO findByUserName(String username);
	
	public Optional<UsersDTO> usooptional(UsersDTO usersdto);
	

}
