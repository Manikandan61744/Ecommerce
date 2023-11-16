package com.example.ecommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.modal.Role;
import com.example.ecommerce.repository.RoleRepository;
import com.example.ecommerce.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	
	public boolean deleteRoleById(int id) {
		roleRepository.deleteById(id);
		return true;
	}


	@Override
	public String saveRole(Role role ) {
		roleRepository.save(role);
		return "success";
	}


	@Override
	public Optional<Role> getRoleById(int id) {
		Optional<Role> role= roleRepository.findById(id);
		return role;
	}


	@Override
	public List<Role> getAllRole() {
		 List<Role> role =roleRepository.findAll();
		 return role;
	}
	
	
}
