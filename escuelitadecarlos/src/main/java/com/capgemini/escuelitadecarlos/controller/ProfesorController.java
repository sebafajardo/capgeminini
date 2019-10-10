package com.capgemini.escuelitadecarlos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.escuelitadecarlos.interfac.ProfesorRepository;
import com.capgemini.escuelitadecarlos.model.Alumno;
import com.capgemini.escuelitadecarlos.model.Profesor;

@Controller
public class ProfesorController {
	@Autowired
	private ProfesorRepository repository;
	
	@GetMapping ("/login")
	public String login (Model model) {
		
		model.addAttribute("profesor", new Profesor());
		
		return "login";
	}
	
	@PostMapping ("/acceso")
	 public String choriSubmit(@ModelAttribute Profesor profesor) {
    	String aux="lalala";
		for (Profesor p :repository.findAll()) {
			if (p.getUsername() == profesor.getUsername() && p.getPassword() == profesor.getPassword()) {
				
				aux="acceso";
			}
			else {
				aux="login";
			
			}

		}
		
		return aux;
    }
	
}
