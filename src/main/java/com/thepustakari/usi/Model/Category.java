package com.thepustakari.usi.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Category_Table")
@Data
public class Category { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int CategoryId;
	@Column
	private String CategoryDescription;
	
	//@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, mappedBy="Item")
	//@Builder.Default
	//@OneToMany(mappedBy="Category")
	private List<Item> items;

}
