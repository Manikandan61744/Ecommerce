package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.modal.OrderTracking;
import com.example.ecommerce.service.OrderTrackService;
@RestController
public class OrderTrackcontroller {

	@Autowired
	OrderTrackService orderTrackService;
	@PostMapping("/saveordertrack")
	public boolean saveAndUpdateOrderTrack(OrderTracking orderTracking) {
		return orderTrackService.saveAndUpdateOrderTrack(orderTracking);
	}
	@GetMapping("/allt")
	public List<OrderTracking> getAllOrdertracking(){
		return orderTrackService.getAllOrdertracking();
	}
}
