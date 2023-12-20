package com.alansoareslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansoareslima.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
