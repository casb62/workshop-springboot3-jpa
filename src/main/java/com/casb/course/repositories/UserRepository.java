package com.casb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
