package com.capgemini.escuelitadecarlos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.escuelitadecarlos.interfac.AlumnoRepository;
import com.capgemini.escuelitadecarlos.interfac.TemasRepository;
import com.capgemini.escuelitadecarlos.model.Alumno;
import com.capgemini.escuelitadecarlos.model.Temas;
import com.capgemini.escuelitadecarlos.model.TemasListContainer;

@Controller
public class TemasController {
	@Autowired
	private TemasRepository repository;
	
	@GetMapping ("/temas")
	public String alumnoForm(Model model) {
		
        model.addAttribute("t", repository.findAll());
        return "temas";
        
    }
	@PostMapping("/temasresult")
    public String choriSubmit(@ModelAttribute("t") TemasListContainer temas) {
    //	repository.save(alumno);	
        return "temasresult";
    }
	

}
