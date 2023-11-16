package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dto.OrderDto;
import com.example.ecommerce.modal.Order;
import com.example.ecommerce.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/placeorder") 
	public boolean placeOrder() {
		return orderService.placeOrder();	
	}
	@GetMapping("/delete")
	public boolean deleteOrderById(int id) {
		return orderService.deleteOrderById(id);
	}
	@GetMapping("/getorders")
	public Order getOrderById(int id) {
		return orderService.getOrderById(id);
	}
	@GetMapping("/allorders")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
}
