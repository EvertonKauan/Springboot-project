package com.kauaneverton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kauaneverton.entities.User;

@Repository // optional
public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
