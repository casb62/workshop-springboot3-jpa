package com.casb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.casb.curso.entities.OrderItem;
import com.casb.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}