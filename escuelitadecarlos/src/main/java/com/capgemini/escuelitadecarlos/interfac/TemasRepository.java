package com.capgemini.escuelitadecarlos.interfac;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.escuelitadecarlos.model.Alumno;
import com.capgemini.escuelitadecarlos.model.Temas;

public interface TemasRepository extends CrudRepository<Temas, Long> {

}