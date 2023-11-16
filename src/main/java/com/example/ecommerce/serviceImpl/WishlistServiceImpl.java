package com.example.ecommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dto.WishlistDto;
import com.example.ecommerce.modal.Item;
import com.example.ecommerce.modal.User;
import com.example.ecommerce.modal.Wishlist;
import com.example.ecommerce.repository.ItemRepository;
import com.example.ecommerce.repository.UserRepository;
import com.example.ecommerce.repository.WishlistRepository;
import com.example.ecommerce.service.WishlistService;

@Service
public class WishlistServiceImpl implements WishlistService{

	@Autowired
	WishlistRepository wishlistRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ItemRepository itemRepository;
	
	public boolean saveOrUpdateWishlist(WishlistDto wishlistDto) {
		Optional<User> user= userRepository.findById(wishlistDto.getUserid());
		Optional<Item> item=itemRepository.findById(wishlistDto.getItemid());
		
		Wishlist wishlist= new Wishlist();
		wishlist.setId(wishlistDto.getId());
		wishlist.setItemname(item.get().getName());
		wishlist.setItemprice(item.get().getPrice());
		wishlist.setItem(item.get());
		wishlist.setUser(user.get());
		
		wishlistRepository.save(wishlist);
		return true;
	}
	
	public List<Wishlist> getAll() {
		List<Wishlist> wishlist=wishlistRepository.findAll();
		return wishlist;
	}
	
	public boolean deleteById(int id) {
		wishlistRepository.deleteById(id);
		return true;
	}
}
