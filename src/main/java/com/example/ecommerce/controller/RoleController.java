package com.example.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.modal.Role;
import com.example.ecommerce.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@PostMapping("/save")
	public String saveRole(Role role) {
		return roleService.saveRole(role);
	}
	@GetMapping("/delete")
	public boolean deleteRoleById(int id) {
		return roleService.deleteRoleById(id);
	}
	@GetMapping("/getId")
	public Optional<Role> getRoleById(int id) {
		return roleService.getRoleById(id);
	}
	@GetMapping("/getAll")
	public List<Role> getAllRole(){
		return roleService.getAllRole();
	}
}
