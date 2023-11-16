package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.modal.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
