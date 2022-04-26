package com.estudandoferramentas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoferramentas.course.entities.Category;

 
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
