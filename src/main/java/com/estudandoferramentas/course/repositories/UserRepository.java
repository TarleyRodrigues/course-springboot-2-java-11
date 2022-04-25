package com.estudandoferramentas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoferramentas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
