package com.example.demo.model.dto;

import java.sql.Date;

public class ProfesoresDTO{
	private Integer rutprofesor;
	private String digitoverif;
	private String profenombre;
	private String profeapellidopat;
	private String profeapellidomat;
	private Date profefechanac;
	private String profedireccion;
	private Integer profetelefono;
	private String profemail;
	private Integer idasignatura;
	private String nivelprofe;
	
	private String curnivel;
	private String curletra;
	public ProfesoresDTO() {
	
	}

	public Integer getRutprofesor() {
		return rutprofesor;
	}

	public void setRutprofesor(Integer rutprofesor) {
		this.rutprofesor = rutprofesor;
	}

	public String getDigitoverif() {
		return digitoverif;
	}

	public void setDigitoverif(String digitoverif) {
		this.digitoverif = digitoverif;
	}

	public String getProfenombre() {
		return profenombre;
	}

	public void setProfenombre(String profenombre) {
		this.profenombre = profenombre;
	}

	public String getProfeapellidopat() {
		return profeapellidopat;
	}

	public void setProfeapellidopat(String profeapellidopat) {
		this.profeapellidopat = profeapellidopat;
	}

	public String getProfeapellidomat() {
		return profeapellidomat;
	}

	public void setProfeapellidomat(String profeapellidomat) {
		this.profeapellidomat = profeapellidomat;
	}

	public Date getProfefechanac() {
		return profefechanac;
	}

	public void setProfefechanac(Date profefechanac) {
		this.profefechanac = profefechanac;
	}

	public String getProfedireccion() {
		return profedireccion;
	}

	public void setProfedireccion(String profedireccion) {
		this.profedireccion = profedireccion;
	}

	public Integer getProfetelefono() {
		return profetelefono;
	}

	public void setProfetelefono(Integer profetelefono) {
		this.profetelefono = profetelefono;
	}

	public String getProfemail() {
		return profemail;
	}

	public void setProfemail(String profemail) {
		this.profemail = profemail;
	}

	public Integer getIdasignatura() {
		return idasignatura;
	}

	public void setIdasignatura(Integer idasignatura) {
		this.idasignatura = idasignatura;
	}

	public String getNivelprofe() {
		return nivelprofe;
	}

	public void setNivelprofe(String nivelprofe) {
		this.nivelprofe = nivelprofe;
	}

	public String getCurnivel() {
		return curnivel;
	}

	public void setCurnivel(String curnivel) {
		this.curnivel = curnivel;
	}

	public String getCurletra() {
		return curletra;
	}

	public void setCurletra(String curletra) {
		this.curletra = curletra;
	}
	
}
