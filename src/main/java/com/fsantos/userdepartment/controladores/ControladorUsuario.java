package com.fsantos.userdepartment.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsantos.userdepartment.entidades.Usuario;
import com.fsantos.userdepartment.repositorios.RepositorioUsuario;

@RestController
@RequestMapping(value = "/users")
public class ControladorUsuario {

	@Autowired
	private RepositorioUsuario repositorio;
	
	@GetMapping
	public List<Usuario> buscarTodos(){
		return repositorio.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Usuario buscarPorId(@PathVariable Long id){
		return repositorio.findById(id).get();
	}
	
	@PostMapping
	public Usuario inserir(@RequestBody Usuario usuario){
		return repositorio.save(usuario);
	}
	
	
}
