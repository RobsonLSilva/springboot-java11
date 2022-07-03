package br.edu.robson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.robson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
