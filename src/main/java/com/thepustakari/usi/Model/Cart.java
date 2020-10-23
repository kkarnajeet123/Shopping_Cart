package com.thepustakari.usi.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Cart_Table")
@Data
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 

	@Column(name="Cart_id")
	private int CartId;
	@Column (name="session_date")
	private Date date;
	@Column(name="")
	
	@OneToMany(mappedBy = "cart")
	private List<Product> items;

}
