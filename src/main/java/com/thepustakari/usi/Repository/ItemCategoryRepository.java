package com.thepustakari.usi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thepustakari.usi.Model.Item;
@Repository
public interface ItemCategoryRepository extends CrudRepository<Item, Integer>{

}
