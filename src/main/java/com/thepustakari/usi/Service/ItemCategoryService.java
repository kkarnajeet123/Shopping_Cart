package com.thepustakari.usi.Service;

import java.util.List;

import com.thepustakari.usi.Model.Item;

public interface ItemCategoryService {
	
	void saveItemInfo(Item item);
	void updateItemInfo(Item item);
	void deleteItemInfo(int id);
	Item getItemById(int id);
	List<Item> getAllItems();
	

}
