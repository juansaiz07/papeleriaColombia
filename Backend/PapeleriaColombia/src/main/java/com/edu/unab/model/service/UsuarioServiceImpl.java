package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Usuario;
import com.edu.unab.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepository.findById(id);
	}
	
	@Override
	@Transactional
	public Usuario save(Usuario u) {
		return usuarioRepository.save(u);
	}
	
	@Override
	@Transactional
	public void deleteById(Integer id) {
		usuarioRepository.deleteById(id);
	}

}
