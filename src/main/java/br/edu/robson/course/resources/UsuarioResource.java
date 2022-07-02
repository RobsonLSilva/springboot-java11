package br.edu.robson.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.robson.course.entities.Usuario;

@RestController
@RequestMapping(value = "/users")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		
		Usuario u = new Usuario(1, "Maria", "maria@gmail.com", "999999999", "12345");
		return ResponseEntity.ok().body(u);
		
	}



}

