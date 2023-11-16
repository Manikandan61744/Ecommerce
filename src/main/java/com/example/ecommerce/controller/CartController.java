package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dto.CartDto;
import com.example.ecommerce.modal.Cart;
import com.example.ecommerce.service.CartService;
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartService cartService;
	@PostMapping("/save")
	public boolean saveOrUpdateCart(CartDto cartDto) {
		 return cartService.saveOrUpdateCart(cartDto);
	}
	@GetMapping("/listall")
	public List<Cart> getAll(){
		return cartService.getAll();
	}
	@GetMapping("/delete")
	public boolean deleteCartItemById(int id) {
		return cartService.deleteCartItemById(id);
	}
}
