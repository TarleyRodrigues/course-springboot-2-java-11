package com.estudandoferramentas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoferramentas.course.entities.Product;

 
public interface ProductRepository extends JpaRepository<Product, Long>{

}
