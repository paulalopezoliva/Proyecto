package com.example.demo.model.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.persistence.Id;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TABLA_ALUMNO")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class AlumnosDTO {

	@Id
	private Integer rutalumno;
	
	private String rutdigitoalumno;
	@Size(min=3,max=30)
	private String nombrealumno;
	@Size(min=3,max=30)
	private String alumnapellidopat;
	@Size(min=3,max=30)
	private String alumnapellidomat;
	private Date alumnfechanacim;
	private String alumndireccion;
	private String alumntelefono;
	private Integer id_curso;

	public AlumnosDTO() {
		
	}

	public Integer getRutalumno() {
		return rutalumno;
	}

	public void setRutalumno(Integer rutalumno) {
		this.rutalumno = rutalumno;
	}

	public String getRutdigitoalumno() {
		return rutdigitoalumno;
	}

	public void setRutdigitoalumno(String rutdigitoalumno) {
		this.rutdigitoalumno = rutdigitoalumno;
	}

	public String getNombrealumno() {
		return nombrealumno;
	}

	public void setNombrealumno(String nombrealumno) {
		this.nombrealumno = nombrealumno;
	}

	public String getAlumnapellidopat() {
		return alumnapellidopat;
	}

	public void setAlumnapellidopat(String alumnapellidopat) {
		this.alumnapellidopat = alumnapellidopat;
	}

	public String getAlumnapellidomat() {
		return alumnapellidomat;
	}

	public void setAlumnapellidomat(String alumnapellidomat) {
		this.alumnapellidomat = alumnapellidomat;
	}

	public Date getAlumnfechanacim() {
		return alumnfechanacim;
	}

	public void setAlumnfechanacim(Date alumnfechanacim) {
		this.alumnfechanacim = alumnfechanacim;
	}

	public String getAlumndireccion() {
		return alumndireccion;
	}

	public void setAlumndireccion(String alumndireccion) {
		this.alumndireccion = alumndireccion;
	}

	public String getAlumntelefono() {
		return alumntelefono;
	}

	public void setAlumntelefono(String alumntelefono) {
		this.alumntelefono = alumntelefono;
	}

	public Integer getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	
}
