package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.modal.Item;

public interface ItemService {

	public boolean saveAndUpdateItem(Item item);
	public boolean deleteItemById(int id);
	public List<Item> getAllItems();
}
