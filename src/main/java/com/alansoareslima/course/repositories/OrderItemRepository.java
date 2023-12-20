package com.alansoareslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansoareslima.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
