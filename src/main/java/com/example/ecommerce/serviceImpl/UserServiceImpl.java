package com.example.ecommerce.serviceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.modal.Role;
import com.example.ecommerce.modal.User;
import com.example.ecommerce.repository.RoleRepository;
import com.example.ecommerce.repository.UserRepository;
import com.example.ecommerce.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	public boolean saveOrUpdateUser(User user) {
		Optional<Role> role= roleRepository.findById(2);
		if(role.isPresent()) {
		user.setRole(role.get());
		userRepository.save(user);
		return true;
		}  
		else {
			return false;
		}
	}
	
	/*public boolean saveOrUpdateUser(User user) {
		userRepository.save(user);
		return true;
	}*/
	
	public boolean deleteUserById(int id) {
		userRepository.deleteById(id);
		return true;
	}
	public List<User> getAllUsers() {
		List<User> user=userRepository.findAll();
		return user;
	}
	public Optional<User> getUserById(int id){
		Optional<User> user= userRepository.findById(id);
		return user;
	}
	
	public boolean checkUserEmailidAndPassword(String emailid,String password) {
		Optional<User> user=userRepository.findByEmailidAndPassword(emailid,password);
		if(user.isPresent()) {
			return true;
		}
		else {
			return false;
		}
	}
}