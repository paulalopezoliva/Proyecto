package com.example.demo.model.dto;

public class UsersDTO {
	
	private Integer user_id;
	private String username;
	private String password;
	private boolean enable;
	
	private Integer id_auth;
	private String authority;
	
	public UsersDTO() {
		
	}
	
	public UsersDTO(Integer user_id, String username, String password, boolean enable, Integer id_auth,
			String authority) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.enable = enable;
		this.id_auth = id_auth;
		this.authority = authority;
	}

	public Integer getId_auth() {
		return id_auth;
	}

	public void setId_auth(Integer id_auth) {
		this.id_auth = id_auth;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
	

}
