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
import com.capgemini.escuelitadecarlos.model.Alumno;
import com.capgemini.form.model.Choripan;

@Controller
public class AlumnoController {
	private static final Logger log = LoggerFactory.getLogger(AlumnoController.class);
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@GetMapping ("/alumno")
	public String alumnoForm(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "alumno";
        
    }
	@PostMapping("/costanera")
    public String choriSubmit(@ModelAttribute Choripan choripan) {
    	repository.save(choripan);	
    	log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (Choripan chori : repository.findAll()) {
			log.info(chori.toString());
		}
		log.info("");
        return "result";
    }
	

}
