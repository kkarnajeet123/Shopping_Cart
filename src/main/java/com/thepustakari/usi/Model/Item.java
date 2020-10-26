package com.thepustakari.usi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;



@Entity
@Table(name="Item_Table") 
@Data

public class Item {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ItemId;
	@Column
	private String ItemName;
	@Column
	private String Description;
	@Column
	private int cost;
	@Column
	private int orderQty;
	
	//@ManyToOne(fetch = FetchType.LAZY, optional=false)
	//@JoinColumn(name = "CategoryId", nullable = false, //
    //foreignKey = @ForeignKey(name = "Item_Id_Category_FK"))
//	private Category category;
    //@ManyToOne(fetch = FetchType.EAGER, optional=false)
    //@JoinColumn(name = "CartId", nullable = false, //
      //      foreignKey = @ForeignKey(name = "Item_Id_Cart_FK"))
    
	//private Cart cart;
   
	//@OneToOne(cascade = CascadeType.ALL)
	//@Builder.Default
	
	//private Photo photo;

}
