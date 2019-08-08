package com.fisi.web.app.Service;

import java.util.List;


import com.fisi.web.app.Entity.Persona;


public interface PersonaService {
	
	List<Persona> listar();

	Persona listarId(int id);

	Persona add(Persona p);

	Persona edit(Persona p);

	Persona delete(int id);

}
