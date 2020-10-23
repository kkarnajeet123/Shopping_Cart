package com.thepustakari.usi.Service;

import java.util.List;

import com.thepustakari.usi.Model.Product;

public interface ItemCategoryService {
	
	void saveItemInfo(Product item);
	void updateItemInfo(Product item);
	void deleteItemInfo(int id);
	Product getItemById(int id);
	List<Product> getAllItems();
	

}
