package com.alansoareslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansoareslima.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
