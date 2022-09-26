package com.kauaneverton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kauaneverton.entities.Category;

@Repository // optional
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}