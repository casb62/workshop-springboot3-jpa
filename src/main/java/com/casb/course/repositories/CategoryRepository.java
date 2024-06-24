package com.casb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
