package com.thepustakari.usi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thepustakari.usi.Model.Item;
@Repository
public interface ItemCategoryRepository extends JpaRepository<Item, Integer>{

}
