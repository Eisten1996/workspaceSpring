package com.fisi.web.app.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisi.web.app.Entity.Persona;
import com.fisi.web.app.Repository.PersonaRepository;
import com.fisi.web.app.Service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaRepository repositorio;
	
	@Override
	public List<Persona> listar() {
		return repositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona add(Persona persona) {
		return null;
	}

	@Override
	public Persona edit(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
