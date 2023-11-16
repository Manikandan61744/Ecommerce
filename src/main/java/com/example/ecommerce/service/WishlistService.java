package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.dto.WishlistDto;
import com.example.ecommerce.modal.Wishlist;

public interface WishlistService {
	
	public boolean saveOrUpdateWishlist(WishlistDto wishlistDto);
	public List<Wishlist> getAll();
	public boolean deleteById(int id);

}
