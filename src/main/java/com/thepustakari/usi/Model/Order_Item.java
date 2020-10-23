package com.thepustakari.usi.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.Data;


@Entity
@Table(name="Purchase_Order_Table")
@Data
public class Order_Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Version
	private int version;
	@ManyToOne
	private Order order;
	@ManyToOne
	private Product product;
	
	
	

}
