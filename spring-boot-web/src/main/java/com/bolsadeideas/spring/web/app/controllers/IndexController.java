package com.bolsadeideas.spring.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.spring.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	@GetMapping({ "/index", "/", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework con model!");
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Eisten");
		usuario.setApellido("Flores");
		usuario.setEmail("eisten.flores@unmsm.edu.pe");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usurio ".concat(usuario.getNombre()));
		return "perfil";
	}

	@RequestMapping("/listar")
	public String Listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios ");
		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Eisten", "Flores", "eisten.flores@unmsm.edu.pe"));
		usuarios.add(new Usuario("Rosa", "Gracia", "rosa.garcia11@unmsm.edu.pe"));
		usuarios.add(new Usuario("Mirko", "Flores", "mitko.flores@pupc.edu.pe"));
		return usuarios;
	}
}