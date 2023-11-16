package com.example.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.modal.Item;
import com.example.ecommerce.repository.ItemRepository;
import com.example.ecommerce.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public boolean saveAndUpdateItem(Item item) {
		itemRepository.save(item);
		return true;
	}
	
	public boolean deleteItemById(int id) {
		itemRepository.deleteById(id);
		return true;
	}
	public List<Item> getAllItems() {
		List<Item> item=itemRepository.findAll();
		return item;
	}
}
