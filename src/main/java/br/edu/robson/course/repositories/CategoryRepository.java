package br.edu.robson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.robson.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
