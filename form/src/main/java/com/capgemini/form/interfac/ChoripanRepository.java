package com.capgemini.form.interfac;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.form.model.Choripan;

@Repository
public interface ChoripanRepository extends CrudRepository<Choripan,Long>{

}
