package com.example.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.modal.OrderDetail;
import com.example.ecommerce.repository.OrderDetailRepository;
import com.example.ecommerce.service.OrderDetailService;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	OrderDetailRepository orderDetailRepository;
	
	public boolean saveAndUpdateOrderDetail(OrderDetail orderDetail) {
		orderDetailRepository.save(orderDetail);
		return true;
	}
	
	public boolean deleteOrderdetailById(int id) {
		orderDetailRepository.deleteById(id);
		return true;
	}
	
	public List<OrderDetail> getAllOrderDetails() {
		List<OrderDetail> orderDetail=orderDetailRepository.findAll();
		return orderDetail;
	}
	
}
