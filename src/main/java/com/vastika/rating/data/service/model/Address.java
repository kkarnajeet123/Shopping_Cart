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
	
		
	public Address(long addressId, String address1, String address2, String city, String state, int zipcode,
			UserInfo userInfo) {
		super();
		AddressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.userInfo = userInfo;
	}


	public Address() {
		super();
	}
	public long getAddressId() {
		return AddressId;
	}
	public void setAddressId(long addressId) {
		AddressId = addressId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public Address(String address1, String address2, String city, String state, int zipcode, UserInfo userInfo) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.userInfo=userInfo;
		
	}
	
}
