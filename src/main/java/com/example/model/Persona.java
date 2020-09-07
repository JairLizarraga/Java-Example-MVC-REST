package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
	
	@Id
	private int idPersona;
		
	@Column(name="nombre", length=50)
	private String nombre;
	
	public int getIdPersona() {
		return idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
