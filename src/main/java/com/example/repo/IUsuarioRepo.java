package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNombre(String nombre);
}
