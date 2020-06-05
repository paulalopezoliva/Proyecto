package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.dto.AlumnosDTO;

public interface AlumnosRepository extends JpaRepository<AlumnosDTO, Integer> {
	

}
