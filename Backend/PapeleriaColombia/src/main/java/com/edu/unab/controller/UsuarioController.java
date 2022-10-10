package com.edu.unab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.edu.unab.model.entity.Usuario;
import com.edu.unab.model.service.UsuarioService;

@RestControllerAdvice
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario>buscarporId(@PathVariable Integer id){
		return usuarioService.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Usuario>listarTodos(){
		return usuarioService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		usuarioService.deleteById(id);
	}
}
