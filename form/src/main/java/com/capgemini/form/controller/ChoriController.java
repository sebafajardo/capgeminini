package com.capgemini.form.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.form.interfac.ChoripanRepository;
import com.capgemini.form.model.Choripan;

@Controller
public class ChoriController {
	private static final Logger log = LoggerFactory.getLogger(ChoriController.class);
	@Autowired
	private ChoripanRepository repository;
	
	@GetMapping("/costanera")
    public String choriForm(Model model) {
        model.addAttribute("choripan", new Choripan());
        return "choripan";
        
    }

	
	
    @PostMapping("/costanera1")
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
