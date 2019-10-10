package com.capgemini.escuelitadecarlos.interfac;

import org.springframework.data.repository.CrudRepository;
import com.capgemini.escuelitadecarlos.model.Profesor;

public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {

}
