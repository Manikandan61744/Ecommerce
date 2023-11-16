package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.dto.CartDto;
import com.example.ecommerce.modal.Cart;

public interface CartService {

	public boolean saveOrUpdateCart(CartDto cartDto);
	public List<Cart> getAll();
	public boolean deleteCartItemById(int id);
}
