package com.casb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
