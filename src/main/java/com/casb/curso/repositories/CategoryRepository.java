package com.casb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.casb.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}