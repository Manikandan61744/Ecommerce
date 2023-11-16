package com.example.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.modal.OrderTracking;
import com.example.ecommerce.repository.OrderTrackRepository;
import com.example.ecommerce.service.OrderTrackService;

@Service
public class OrderTrackServiceImpl implements OrderTrackService {

	@Autowired
	OrderTrackRepository orderTrackRepository;
	
	public boolean saveAndUpdateOrderTrack(OrderTracking orderTracking) {
		orderTrackRepository.save(orderTracking);
		return true;
	}
	public List<OrderTracking> getAllOrdertracking(){
		List<OrderTracking> orderTrackings=orderTrackRepository.findAll();
		return orderTrackings;
	}
	
}
