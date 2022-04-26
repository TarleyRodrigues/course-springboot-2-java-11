package com.estudandoferramentas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoferramentas.course.entities.OrderItem;

 
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
