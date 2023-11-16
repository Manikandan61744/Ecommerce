package com.example.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.example.ecommerce.modal.User;

public interface UserService {
	public boolean saveOrUpdateUser(User user);
	public boolean deleteUserById(int id);
	public List<User> getAllUsers();
	public boolean checkUserEmailidAndPassword(String emailid,String password);
	public Optional<User> getUserById(int id);
	
}
