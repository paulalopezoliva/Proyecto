package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.UsersDAO;

import com.example.demo.model.dto.UsersDTO;

@Service
public class MyUsersDetailsService implements UserDetailsService {
	@Autowired
	CuentasService cuentasservice;
	
	@Autowired
	UsersService usersservice;
/*
	@Override
	public MyUserDetailsServiceImpl loadUserByUsername(String username) throws UsernameNotFoundException {
		CuentasDTO cuenta=cuentasservice.findByUserName(username.toUpperCase());
		
		MyUserDetailsServiceImpl myuser= new MyUserDetailsServiceImpl(cuenta);
		UserDetails user = new User(myuser.getUsername(),myuser.getPassword(),myuser.getAuthorities());
			
		return myuser;
	}
	*/
	/*
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsersDTO userdto=usersservice.findByUserName(username);
		
		MyUserDetailsServiceImpl myuser= new MyUserDetailsServiceImpl(userdto);
		UserDetails user = new User(myuser.getUsername(),myuser.getPassword(),myuser.getAuthorities());
			
		return user;
	}
	*/
	@Autowired
	UsersDAO usersdao;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		//Optional<UsersDTO> usersdto = usersdao.findByUsername(username.toUpperCase());
		
		MyUserDetailsServiceImpl a= new MyUserDetailsServiceImpl(usersdao.getusuario(username));
		
		//usersdto.orElseThrow(() -> new UsernameNotFoundException("Not Found: " + username));
		
		//return usersdto.map(MyUserDetailsServiceImpl::new).get();
		return a;
	}

}
