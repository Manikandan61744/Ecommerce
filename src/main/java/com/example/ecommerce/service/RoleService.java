package com.example.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.example.ecommerce.modal.Role;


public interface RoleService {

	public String saveRole(Role role);
	public boolean deleteRoleById(int id);
	 public Optional<Role> getRoleById(int id);
	public List<Role> getAllRole();
}
