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

import com.edu.unab.model.entity.Roles;
import com.edu.unab.model.service.RolesService;

@RestControllerAdvice
@RequestMapping("api/roles")
public class RolesController {

	@Autowired
	private RolesService rolesService;

	@PostMapping
	public Roles guardar(@RequestBody Roles roles) {
		return rolesService.save(roles);
	}

	@GetMapping("/{id}")
	public Optional<Roles>buscarPorId(@PathVariable Integer id){
	return rolesService.findById(id);
	}
	
	@GetMapping("listar")
	public Iterable<Roles>listarTodos(){
		return rolesService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar (@PathVariable Integer id) {
		rolesService.deleteById(id);
	}
}
