package com.example.ecommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.modal.Cart;
import com.example.ecommerce.modal.Order;
import com.example.ecommerce.modal.OrderDetail;
import com.example.ecommerce.modal.User;
import com.example.ecommerce.repository.CartRepository;
import com.example.ecommerce.repository.OrderDetailRepository;
import com.example.ecommerce.repository.OrderRepository;
import com.example.ecommerce.repository.UserRepository;
import com.example.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	OrderDetailRepository orderDetailRepository;
	
	
	public boolean placeOrder() {
		
		Optional<User> user=userRepository.findById(4);
		
		List<Cart> cart = cartRepository.findAll();
		
		int totalvalue=0;
		for(Cart cartItems:cart) {
		totalvalue = totalvalue + cartItems.getItemprice();
		}
		Order order=new Order();
		order.setTotalvalue(totalvalue);
		order.setDate("5/10/2022");
		order.setUser(user.get());
		Order neworOrder = orderRepository.save(order);
				 
		for(Cart cartItems:cart) {
			OrderDetail orderDetail=new OrderDetail();
			orderDetail.setItemid(cartItems.getItem().getId()); 
			orderDetail.setQuantity(1);
			orderDetail.setItemname(cartItems.getItemname());
			orderDetail.setAmount(cartItems.getItemprice());
			orderDetail.setOrder(neworOrder);
			orderDetailRepository.save(orderDetail);
		}
		cartRepository.deleteAll(); 
	 	return true;
	}
	public boolean deleteOrderById(int id) {
		orderRepository.deleteById(id);
		return true;
	}
	public Order getOrderById(int id) {
		Optional<Order> order= orderRepository.findById(id);
		if(order.isPresent()) {
			return order.get();
		}
		return new Order();
	}
	public List<Order> getAllOrders() {
		List<Order> order= orderRepository.findAll();
		return order;
	}
	 
}
