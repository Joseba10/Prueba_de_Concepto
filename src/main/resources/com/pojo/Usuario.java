package com.pojo;

import javax.validation.constraints.NotNull;

public class Usuario {

	
	@NotNull
	private int id;
	@NotNull
	private String nombre;
	
	@NotNull
	private String apellidos;
	
	@NotNull
	private String email;
	
	@NotNull
	private String pais;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", pais="
				+ pais + "]";
	}

	public Usuario(int id, String nombre, String apellidos, String direccion, String pais) {
		super();
		this.pais = pais;
		this.id = id;
		this.email = email;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}

	public Usuario() {
		super();
	
	}
}