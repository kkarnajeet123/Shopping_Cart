package com.thepustakari.usi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thepustakari.usi.Model.Item;
import com.thepustakari.usi.Service.ItemCategoryService;

@RestController
@RequestMapping("/item")
//@CrossOrigin
public class ItemController {
	
	private final ItemCategoryService itemCategoryService;
	
	@Autowired
	public ItemController(ItemCategoryService itemCategoryService) {
		this.itemCategoryService=itemCategoryService;
	}
	
	@PostMapping
	public void saveItemInfo(@RequestBody Item item) {
		itemCategoryService.saveItemInfo(item);  
	}
	
	@PutMapping
	public void updateItemInfo(@RequestBody Item item) {
		itemCategoryService.saveItemInfo(item);
	}
	@DeleteMapping("/{id}")
	public void deleteItemInfo(@PathVariable int id) {
		itemCategoryService.deleteItemInfo(id); 
	}
	
	@GetMapping("/{id}")
	public Item getItemById(int id) {
		return itemCategoryService.getItemById(id);
	}
	@GetMapping
	public List<Item> item(){
		return itemCategoryService.getAllItems();
	}
}
