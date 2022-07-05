package br.edu.robson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.robson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
