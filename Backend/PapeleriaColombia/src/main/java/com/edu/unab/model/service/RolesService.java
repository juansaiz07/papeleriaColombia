package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Roles;

public interface RolesService {
public Iterable<Roles>findAll();
public Optional<Roles>findById(Integer id);
public Roles save (Roles r);
public void deleteById(Integer id);
}
