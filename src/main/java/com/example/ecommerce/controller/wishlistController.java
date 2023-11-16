package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dto.WishlistDto;
import com.example.ecommerce.modal.Wishlist;
import com.example.ecommerce.service.WishlistService;
@RestController
@RequestMapping("/wishlist")
public class wishlistController {

	@Autowired
	WishlistService wishlistService;
	@PostMapping("/save")
	public boolean saveOrUpdateWishlist(WishlistDto wishlistDto) {
		return wishlistService.saveOrUpdateWishlist(wishlistDto);
	}
	
	@GetMapping("/alllist")
	public List<Wishlist> getAll(){
		return wishlistService.getAll();
	}
	
	@GetMapping("/delete")
	public boolean deleteById(int id) {
		return wishlistService.deleteById(id);
	}
}
