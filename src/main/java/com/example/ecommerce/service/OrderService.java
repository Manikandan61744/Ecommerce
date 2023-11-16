package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.modal.Order;

public interface OrderService {

	public boolean placeOrder();
	public boolean deleteOrderById(int id);
	public Order getOrderById(int id);
	public List<Order> getAllOrders() ;
}
