package com.vastika.rating.data.service.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
//@Table(name="Binding_Tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoJsonBinding  {
	
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int userInfoId;
	@Column(name="Role")
	private long role;
	@Column(name="First_name")
	private String firstName;
	@Column(name="Last_name")
	private String lastName;
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	@Column(name="Address1")
	private String address1;
	@Column(name="Address2")
	private String address2;
	//@Column(name="City")
	private String city;
	@Column(name="State")
	private String state;
	@Column(name="Zip_code")
	private int zipcode;
	private String ActiveUserInfo;
	
}
