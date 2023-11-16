package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.modal.OrderDetail;

public interface OrderDetailService {
	
	public boolean saveAndUpdateOrderDetail(OrderDetail orderDetail);
	public boolean deleteOrderdetailById(int id);
	public List<OrderDetail> getAllOrderDetails();

}
