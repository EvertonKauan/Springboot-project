package com.kauaneverton.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kauaneverton.course.entities.Order;

@Repository // optional
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
