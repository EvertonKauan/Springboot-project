package com.kauaneverton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauaneverton.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
