package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.modal.Category;
import com.example.ecommerce.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	@PostMapping("/save")
	public boolean saveCategory(Category category) {
		return categoryService.saveCategory(category);
	}
	@GetMapping("/delete")
	public boolean deleteById(int id) {
		return categoryService.deleteById(id);
	}
	
}
