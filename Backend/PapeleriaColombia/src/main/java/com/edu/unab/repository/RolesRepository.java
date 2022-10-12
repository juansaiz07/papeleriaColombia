package com.edu.unab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.unab.model.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
