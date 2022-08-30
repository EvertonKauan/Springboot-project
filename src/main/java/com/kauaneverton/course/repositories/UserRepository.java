package com.kauaneverton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kauaneverton.course.entities.User;

@Repository // optional
public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
