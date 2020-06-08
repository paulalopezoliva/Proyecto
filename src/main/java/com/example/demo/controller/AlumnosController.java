package com.example.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.dao.AlumnosDAO;
import com.example.demo.model.dao.AlumnosInterface;
import com.example.demo.model.dto.AlumnosDTO;
import com.example.demo.service.AlumnosService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@Controller
@RequestMapping(value="/alumnos")
public class AlumnosController {
	
	@Autowired
	AlumnosService alumnosservice;
	
	@RequestMapping(value="/list")
	public @ResponseBody List<AlumnosDTO> ajaxList(HttpServletRequest req, HttpServletResponse res){
		List<AlumnosDTO> list = alumnosservice.listar();

		return list;
	}
	@RequestMapping(value="/update")
	public @ResponseBody int ajaxInsert(HttpServletRequest req, HttpServletResponse res) {
		int rows= 0;
			try {
				String RequestData = req.getReader().lines().collect(Collectors.joining());
				Gson gson = new GsonBuilder().setDateFormat("dd-mm-yy").create();
				AlumnosDTO alumnos = gson.fromJson(RequestData, AlumnosDTO.class);
				rows=alumnosservice.update(alumnos);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		return rows;
	}
	@RequestMapping(value="/insert")
	public @ResponseBody int ajaxDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int rows=0;
		try {
		String RequestData =req.getReader().lines().collect(Collectors.joining());
		Gson gson = new GsonBuilder().setDateFormat("dd-mm-yy").create();
		AlumnosDTO alumnos = gson.fromJson(RequestData, AlumnosDTO.class);
		//alumnos.setRutalumno(req);
		alumnosservice.insert(alumnos);
		if(alumnos!=null) {
			rows=1;
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return rows;
	}

	@RequestMapping(value="/get")
	public @ResponseBody AlumnosDTO ajaxGet(HttpServletRequest req, HttpServletResponse res) {
		AlumnosDTO alumnos =alumnosservice.getOne(Integer.parseInt(req.getParameter("rutalumno")));
		return alumnos;
	}


	@RequestMapping(value="/delete")
	public @ResponseBody int ajaxUpdate(HttpServletRequest req, HttpServletResponse res) {
		int rows=alumnosservice.delete(Integer.parseInt(req.getParameter("rutalumno")));
		return rows;
	}

}