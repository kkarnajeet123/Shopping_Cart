package com.thepustakari.usi.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="Address_Table")
@Data 
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int AddressId;
	//@NotNull(message="Please enter valid Address")
	private String Address1;
	private String Address2;
	//@NotNull
	private String City;
	//@NotNull
	private String State;
	//@NotNull
	private int Zipcode;
}
