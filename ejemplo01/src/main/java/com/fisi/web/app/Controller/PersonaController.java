package com.fisi.web.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisi.web.app.Entity.Persona;
import com.fisi.web.app.Service.PersonaService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class PersonaController {
	
	@Autowired
	private PersonaService service;
	
	@GetMapping
	public List<Persona>listar(){
		return service.listar();
	}

}
