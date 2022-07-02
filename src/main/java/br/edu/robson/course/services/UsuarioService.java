package br.edu.robson.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.robson.course.entities.Usuario;
import br.edu.robson.course.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	public List<Usuario> findAll(){
		return repository.findAll();
	}
	
	public Usuario findById(Long id){
		Optional<Usuario> obj = repository.findById(id);
		 return	obj.get();
	}
}
