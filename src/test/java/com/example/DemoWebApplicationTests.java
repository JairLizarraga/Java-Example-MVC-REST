package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.model.Usuario;
import com.example.repo.IUsuarioRepo;

@SpringBootTest
class DemoWebApplicationTests {

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Test
	void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(2);
		us.setNombre("usuario");
		us.setClave(encoder.encode("usuario"));
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
