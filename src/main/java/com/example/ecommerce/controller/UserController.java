package com.example.ecommerce.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ecommerce.modal.User;
import com.example.ecommerce.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public boolean saveOrUpdateUser(User user) {
		return userService.saveOrUpdateUser(user);
	}
	@GetMapping("/delete")
	public boolean deleteUserById(int id) {
		return userService.deleteUserById(id);
	}
	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	@GetMapping("/byid")
	public Optional<User> getUserById(int id){
		return userService.getUserById(id);
	}
	@PostMapping("/check")
	public boolean checkUserEmailidAndPassword(String emailid,String password) {
		return userService.checkUserEmailidAndPassword(emailid, password);
	}
}
