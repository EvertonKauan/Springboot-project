package com.kauaneverton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kauaneverton.course.entities.Product;

@Repository // optional
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
