package com.casb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.casb.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
