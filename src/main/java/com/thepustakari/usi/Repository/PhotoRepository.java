package com.thepustakari.usi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thepustakari.usi.Model.Photo;
@Repository
public interface PhotoRepository extends CrudRepository<Photo, Integer>{

}
