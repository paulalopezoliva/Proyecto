package com.example.demo.model.dto;


public class CuentasDTO {
	
	private Integer id_cuenta;
	private Integer rutapoderado;
	private String correo;
	private String contraseña;
	private String rol;
	private boolean enable;
	
	public CuentasDTO() {
	}

	public boolean getEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Integer getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(Integer id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public Integer getRutapoderado() {
		return rutapoderado;
	}

	public void setRutapoderado(Integer rutapoderado) {
		this.rutapoderado = rutapoderado;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo=correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	

}
