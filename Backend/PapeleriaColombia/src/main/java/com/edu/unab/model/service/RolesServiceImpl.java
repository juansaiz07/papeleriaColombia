package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Roles;
import com.edu.unab.repository.RolesRepository;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesRepository rolesRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Roles> findAll() {
		return rolesRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Roles> findById(Integer id) {
		return rolesRepository.findById(id);
	}

	@Override
	@Transactional
	public Roles save(Roles r) {
		return rolesRepository.save(r);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		rolesRepository.deleteById(id);
	}

}
