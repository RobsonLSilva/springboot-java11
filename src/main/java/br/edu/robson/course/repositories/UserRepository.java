package br.edu.robson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.robson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
