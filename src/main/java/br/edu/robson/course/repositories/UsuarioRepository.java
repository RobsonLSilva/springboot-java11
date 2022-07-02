package br.edu.robson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.robson.course.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
