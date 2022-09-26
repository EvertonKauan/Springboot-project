package com.kauaneverton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kauaneverton.entities.OrderItem;

@Repository // optional
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
}
