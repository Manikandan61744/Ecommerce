package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.modal.OrderTracking;

public interface OrderTrackRepository extends JpaRepository<OrderTracking, Integer> {

}
