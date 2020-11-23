package com.vastika.rating.data.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="Address_Tbl")
@Data
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="Address_Id")
	private long AddressId;
	@Column (name="Address1")
	private String address1;
	@Column (name="Address2")
	private String address2;
	@Column (name="City")
	private String city;
	@Column (name="State")
	private String state;
	@Column (name="zip_code")
	private int zipcode;
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name="User_Id")
	private UserInfo userInfo;

	
	
}
