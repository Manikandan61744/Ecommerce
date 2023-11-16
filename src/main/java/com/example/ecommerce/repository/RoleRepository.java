package com.example.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.modal.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	

	//Optional<Role> findOne(int i);

}
