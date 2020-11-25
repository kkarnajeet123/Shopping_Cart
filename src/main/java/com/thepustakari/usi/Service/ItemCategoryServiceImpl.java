package com.thepustakari.usi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepustakari.usi.Model.Item;
import com.thepustakari.usi.Repository.ItemCategoryRepository;


@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {
	@Autowired
	private ItemCategoryRepository itemCategoryRepository;
	
//	@Autowired
//	public ItemCategoryServiceImpl(ItemCategoryRepository itemCategoryRepository) {
//		this.itemCategoryRepository=itemCategoryRepository;
//	}
//	
	
	@Override
	public void saveItemInfo(Item item) {
		itemCategoryRepository.save(item);
		
	}

	@Override
	public void updateItemInfo(Item item) {
		itemCategoryRepository.save(item);
		
	}

	@Override
	public void deleteItemInfo(int id) {
		itemCategoryRepository.deleteById(id);
		
		
	}

	@Override
	public Item getItemById(int id) {
		
		return itemCategoryRepository.findById(id).get();
	}

	@Override
	public List<Item> getAllItems() {
		//return list<Items>
		List<Item>items=new ArrayList<>();
		itemCategoryRepository.findAll()
		.forEach(items::add);
		
		return items;
	}

}
