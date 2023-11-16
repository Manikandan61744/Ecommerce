package com.example.ecommerce.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.modal.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmailidAndPassword(String emailid, String password);

	

	

	

	

	
}
