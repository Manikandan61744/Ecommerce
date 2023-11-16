package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.modal.OrderDetail;
import com.example.ecommerce.service.OrderDetailService;

@RestController
@RequestMapping("/orderdetail")
public class OrderdetailController {

	@Autowired
	OrderDetailService orderDetailService;
	@PostMapping("/saveorderdetail")
	public boolean saveAndUpdateOrderDetail(OrderDetail orderDetail) {
		return orderDetailService.saveAndUpdateOrderDetail(orderDetail);
	}
	@GetMapping("/deleteorderdetail")
	public boolean deleteOrderdetailById(int id) {
		return orderDetailService.deleteOrderdetailById(id);
	}
	@GetMapping("/alldetails")
	public List<OrderDetail> getAllOrderDetails(){
		return orderDetailService.getAllOrderDetails();
	}
}
