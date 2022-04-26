package com.estudandoferramentas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoferramentas.course.entities.Order;

 
public interface OrderRepository extends JpaRepository<Order, Long>{

}
