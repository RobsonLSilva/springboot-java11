package br.edu.robson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.robson.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
