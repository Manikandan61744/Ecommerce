package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.modal.Item;
import com.example.ecommerce.service.ItemService;

@RestController
public class Itemcontroller {

	@Autowired
	ItemService itemService;
	@PostMapping("/saveitems")
	public boolean saveAndUpdateItem(Item item) {
		return itemService.saveAndUpdateItem(item);
	}
	@GetMapping("/deleteitem")
	public boolean deleteItemById(int id) {
		return itemService.deleteItemById(id);
	}
	@GetMapping("/allitem")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
}
