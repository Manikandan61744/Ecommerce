package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.modal.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

}
