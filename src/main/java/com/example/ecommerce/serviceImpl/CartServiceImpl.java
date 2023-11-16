package com.example.ecommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dto.CartDto;
import com.example.ecommerce.modal.Cart;
import com.example.ecommerce.modal.Item;
import com.example.ecommerce.modal.User;
import com.example.ecommerce.repository.CartRepository;
import com.example.ecommerce.repository.ItemRepository;
import com.example.ecommerce.repository.UserRepository;
import com.example.ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;

	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	public boolean saveOrUpdateCart(CartDto cartDto) {
		Optional<User> user=userRepository.findById(cartDto.getUserid());
		Optional<Item> item =itemRepository.findById(cartDto.getItemid());
		
		Cart cart=new Cart();
		cart.setId(cartDto.getId());
		cart.setItemname(item.get().getName());
		cart.setItemprice(item.get().getPrice());
		cart.setItem(item.get());
		cart.setUser(user.get());
		
		cartRepository.save(cart);
		return true;
		
	}
	public List<Cart> getAll() {
		List<Cart> cart=cartRepository.findAll();
		return cart;
	}
	public boolean deleteCartItemById(int id) {
		cartRepository.deleteById(id);
		return true;
	}
}
