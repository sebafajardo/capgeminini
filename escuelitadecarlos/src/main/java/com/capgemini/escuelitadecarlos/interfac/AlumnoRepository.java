package com.capgemini.escuelitadecarlos.interfac;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.escuelitadecarlos.model.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {

}
