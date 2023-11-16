package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.modal.OrderTracking;

public interface OrderTrackService {

	public boolean saveAndUpdateOrderTrack(OrderTracking orderTracking);
	public List<OrderTracking> getAllOrdertracking();
}
