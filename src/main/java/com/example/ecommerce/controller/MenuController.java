package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

	@GetMapping("/")
	public String loginScreen() {
		return "login";
	}
	@GetMapping("/homepage")
	public String HomeScreen() {
		return "homepg";
	}
	
	@GetMapping("/cart")
	public String CartScreen() {
		return "cart";
}
	@GetMapping("/product")
	public String ProductScreen() {
		return "product";
	}
	@GetMapping("/wishlist")
	public String WishlistScreen() {
		return "wishlist";
	}
	@GetMapping("/order")
	public String OrderScreen() {
		return "order";
	}
	@GetMapping("/orderdetail")
	public String OrderDetailScreen() {
		return "orderdetail";
	}
	@GetMapping("/ordertracking")
	public String ordertracking() {
		return "ordertrackingdm";
	}
}
