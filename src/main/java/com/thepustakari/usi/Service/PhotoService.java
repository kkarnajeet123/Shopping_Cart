package com.thepustakari.usi.Service;

import java.util.List;

import com.thepustakari.usi.Model.Photo;

public interface PhotoService {
	
	void savePhotoInfo(Photo photo);
	void updatePhotoInfo(Photo photo);
	void deletePhotoById(int id);
	Photo getPhotoById(int id);
	List<Photo> getAllPhoto();

}
