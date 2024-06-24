package com.casb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
