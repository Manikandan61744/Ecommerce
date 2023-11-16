package com.example.ecommerce.service;

import com.example.ecommerce.modal.Category;

public interface CategoryService {

	public boolean saveCategory(Category category);
	public boolean deleteById(int id);
	
}
