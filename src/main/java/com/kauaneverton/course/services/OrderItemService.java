/* package com.kauaneverton.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kauaneverton.course.entities.OrderItem;
import com.kauaneverton.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem> findAll() {
		return repository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}
	
	public OrderItem insert(OrderItem obj) {
		return repository.save(obj);
	}
	/*
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Order update(Long id, Order obj) {
		Order entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Order entity, Order obj) {
		entity.setOrderStatus(obj.getOrderStatus());
		entity.setClient(obj.getClient());
		
	} 
}*/
