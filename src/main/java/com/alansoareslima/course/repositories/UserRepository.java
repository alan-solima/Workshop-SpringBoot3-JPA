package com.alansoareslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansoareslima.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
