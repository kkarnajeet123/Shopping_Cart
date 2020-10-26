package com.thepustakari.usi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepustakari.usi.Model.Photo;
import com.thepustakari.usi.Repository.PhotoRepository;
@Service
public class PhotoServiceImpl implements PhotoService {
	
	@Autowired
	private PhotoRepository photoRepository;
	
	
	/*
	 * public PhotoServiceImpl(PhotoRepository photoRepository) {
	 * this.photoRepository=photoRepository; }
	 */
	
	@Override
	public void savePhotoInfo(Photo photo) {
		photoRepository.save(photo);

	}

	@Override
	public void updatePhotoInfo(Photo photo) {
		photoRepository.save(photo);

	}

	@Override
	public void deletePhotoById(int id) {
		photoRepository.deleteById(id);

	}

	@Override
	public Photo getPhotoById(int id) {
		return photoRepository.findById(id).get();
		
	}

	@Override
	public List<Photo> getAllPhoto() {
		//return list<Photo>
		List<Photo>photos =new ArrayList<Photo>();
		photoRepository.findAll().forEach(photos::add);
		return photos;
	}

}
