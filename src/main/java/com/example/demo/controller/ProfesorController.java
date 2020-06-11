package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.dto.AlumnosDTO;
import com.example.demo.model.dto.ProfesoresDTO;
import com.example.demo.service.AlumnosService;
import com.example.demo.service.ProfesoresService;

@Controller
@RequestMapping(value="/paginaprofesor")
public class ProfesorController {
	
	@Autowired
	AlumnosService alumnosservice;
	@Autowired
	ProfesoresService profesoresservice;
	
	@RequestMapping(value="/list")
	public @ResponseBody List<AlumnosDTO> ajaxList(HttpServletRequest req, HttpServletResponse res){
		List<AlumnosDTO> list = alumnosservice.listar();

		return list;
	}
	@RequestMapping(value="/listacurso")
	public @ResponseBody ProfesoresDTO ajaxListcursos(HttpServletRequest req, HttpServletResponse res){
		ProfesoresDTO a=profesoresservice.lista(Integer.parseInt(req.getParameter("rutprofesor")));
		System.out.println(a.getProfenombre()+" "+a.getProfeapellidopat()+" "+a.getProfeapellidomat());
		return a;
		
	}
}
