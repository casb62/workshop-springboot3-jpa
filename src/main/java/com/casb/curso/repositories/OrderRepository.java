package com.casb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.casb.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
