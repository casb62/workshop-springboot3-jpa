package com.casb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casb.course.entities.OrderItem;
import com.casb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}