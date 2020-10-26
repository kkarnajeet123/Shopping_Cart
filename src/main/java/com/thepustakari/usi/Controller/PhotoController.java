package com.thepustakari.usi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thepustakari.usi.Model.Photo;
import com.thepustakari.usi.Service.PhotoService;

@RestController
@RequestMapping("/photo")
@CrossOrigin
public class PhotoController {
	
	private PhotoService photoService;
	
	@Autowired
	public PhotoController(PhotoService photoService) {
		this.photoService=photoService; 
	}
	
	@PostMapping
	public void savePhotoInfo(Photo photo) {
		photoService.savePhotoInfo(photo); 
	}
	
	@PutMapping
	public void updatePhotoInfo(Photo photo) {
		photoService.updatePhotoInfo(photo);
	}
	@DeleteMapping
	public void deletePhotoById(int id) {
	photoService.deletePhotoById(id);
	}
	@GetMapping("/{id}")
	Photo photoById(int id) {
		return photoService.getPhotoById(id); 
	}
	@GetMapping
	List<Photo> getAllPhoto(){
	return photoService.getAllPhoto();
	}
}
