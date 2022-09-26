package com.kauaneverton.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kauaneverton.entities.Order;

@Repository // optional
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
