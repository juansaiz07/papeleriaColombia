package com.edu.unab.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@Column(name="id_usuario")
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="fecha_nacimiento")
	private Date fecha_nacimiento;
	@Column(name="direccion")
	private String direccion;
	@Column(name="cedula")
	private Integer cedula;
	@Column(name="celular")
	private Integer celular;
	@Column(name="correo")
	private String correo;
	@Column(name="id_ciudad")
	private Integer id_ciudad;
	@Column(name="password")
	private String password;
	@Column(name="estado")
	private String estado;
	@Column(name="id_roles")
	private Integer id_roles;

	public Usuario(Integer id, String nombre, Date fecha_nacimiento, String direccion, Integer cedula, Integer celular,
			String correo, Integer id_ciudad, String password, String estado, Integer id_roles) {
	
		this.id = id;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.cedula = cedula;
		this.celular = celular;
		this.correo = correo;
		this.id_ciudad = id_ciudad;
		this.password = password;
		this.estado = estado;
		this.id_roles = id_roles;
	}

	public Usuario() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getId_ciudad() {
		return id_ciudad;
	}

	public void setId_ciudad(Integer id_ciudad) {
		this.id_ciudad = id_ciudad;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getId_roles() {
		return id_roles;
	}

	public void setId_roles(Integer id_roles) {
		this.id_roles = id_roles;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", direccion="
				+ direccion + ", cedula=" + cedula + ", celular=" + celular + ", correo=" + correo + ", id_ciudad="
				+ id_ciudad + ", password=" + password + ", estado=" + estado + ", id_roles=" + id_roles + "]";
	}

}
