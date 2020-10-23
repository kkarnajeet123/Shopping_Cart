package com.thepustakari.usi.Model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import lombok.Setter;



@Entity
@Table(name="Item_Table") 
@Data

public class Product {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int ItemId;
	@Column
	private String ItemName;
	@Column
	private String Description;
	@Column
	private int cost;
	@Column
	private int orderQty;
	
	@ManyToOne
	private Category category;
	
    @ManyToOne
	private Cart cart;
   
	@OneToMany(mappedBy="item")
	private List<Photo>photos;
	
	@OneToMany(mappedBy="item")
	private List<Order_Item>order_item;
	

}

