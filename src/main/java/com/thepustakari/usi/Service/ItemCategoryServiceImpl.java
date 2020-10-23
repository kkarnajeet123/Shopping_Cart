package com.thepustakari.usi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepustakari.usi.Model.Product;
import com.thepustakari.usi.Repository.ItemCategoryRepository;


@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

	private ItemCategoryRepository itemCategoryRepository;
	@Autowired
	public ItemCategoryServiceImpl(ItemCategoryRepository itemCategoryRepository) {
		this.itemCategoryRepository=itemCategoryRepository;
	}
	
	
	@Override
	public void saveItemInfo(Product item) {
		itemCategoryRepository.save(item);
		
	}

	@Override
	public void updateItemInfo(Product item) {
		itemCategoryRepository.save(item);
		
	}

	@Override
	public void deleteItemInfo(int id) {
		itemCategoryRepository.deleteById(id);
		
	}

	@Override
	public Product getItemById(int id) {
		
		return itemCategoryRepository.findById(id).get();
	}

	@Override
	public List<Product> getAllItems() {
		
		return itemCategoryRepository.findAll();
	}

}
