package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Usuario;

public interface UsuarioService {
public Iterable<Usuario>findAll();
public Optional<Usuario>findById(Integer id);
public Usuario save(Usuario u);
public void deleteById(Integer id);  
}
