package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebAppController{
	
	@RequestMapping("/")
	public String getHome() {
		return "home";
	}
	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}
	@RequestMapping("/alumnos_page")
	public String getAlumnos() {
		return "alumnos";
	}
	
	@RequestMapping("/login")	
	public String getLoginapoderados() {
		return "login";
	}
	@RequestMapping("/paginaprofesor")
	public String getPaginaapoderados() {
		return "paginaprofesor";
	}
}
