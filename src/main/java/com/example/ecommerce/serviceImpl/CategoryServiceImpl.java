package com.example.ecommerce.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.modal.Category;
import com.example.ecommerce.repository.CategoryRepository;
import com.example.ecommerce.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public boolean saveCategory(Category category) {
		categoryRepository.save(category);
		return true;
	}
	
	public boolean deleteById(int id) {
		categoryRepository.deleteById(id);
		return true;
	}

	
}
