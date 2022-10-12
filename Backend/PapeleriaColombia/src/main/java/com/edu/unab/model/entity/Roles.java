package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Roles {
	@Id
	@Column(name="id_roles") 
	private Integer id_roles;
	@Column(name="descripcion")
	private String descripcion;
	
	public Roles(Integer id_roles, String descripcion) {
	
		this.id_roles = id_roles;
		this.descripcion = descripcion;
	}

	public Roles() {
		
	}

	public Integer getId_roles() {
		return id_roles;
	}

	public void setId_roles(Integer id_roles) {
		this.id_roles = id_roles;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Roles [id_roles=" + id_roles + ", descripcion=" + descripcion + "]";
	}
	
	

}
