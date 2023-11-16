package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.modal.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
