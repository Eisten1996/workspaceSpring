package com.fisi.web.app.Repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.fisi.web.app.Entity.Persona;


public interface PersonaRepository extends Repository<Persona,Integer> {
	
	List<Persona>findAll();
	
	Persona findById(int id);
	
	Persona save(Persona p);
	
	void delete(Persona p);
}
