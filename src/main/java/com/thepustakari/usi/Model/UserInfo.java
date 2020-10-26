package com.thepustakari.usi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "User_Table")
@Data 
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int userId;
	private String email;
	private String password;
	@Column(name="first_name")
	private String FirstName;
	@Column(name="last_name")
	private String LastName;
	
	
//	@OneToOne(CascadeType.MERGE)
	private Address address;
	//@OneToOne(cascade = CascadeType.MERGE)
	private Role role;

}
