package com.thepustakari.usi.Model;



import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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


public class Item {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int ItemId;
	private String ItemName;
	private String Description;
	private int cost;
	private int orderQty;
	/*
	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@JoinColumn(name = "CategoryId", nullable = false, //
    foreignKey = @ForeignKey(name = "Item_Id_Category_FK"))
	private Category category;
    @ManyToOne(fetch = FetchType.EAGER, optional=false)
    @JoinColumn(name = "CartId", nullable = false, //
            foreignKey = @ForeignKey(name = "Item_Id_Cart_FK"))
	private Cart cart;
    */
	@OneToMany(mappedBy="Photo")
	//@Builder.Default
	private List<Photo> photos;

}
