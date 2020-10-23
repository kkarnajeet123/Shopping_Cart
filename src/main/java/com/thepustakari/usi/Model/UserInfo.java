package com.thepustakari.usi.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "User_Table")
@Data 
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	// @NotNull
	@Column (name="email")
	private String email;
	// @NotNull
	@Column (name="password")
	private String password;
	// @NotNull
	@Column (name="first_name")
	private String FirstName;
	// @NotNull
	@Column	(name="last_name")
	private String LastName;
		
	@Column(name="last_loginDate")
	private Date lastLoginDate;
	
	@Column
	private String confirmedPassword;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToOne(cascade = CascadeType.MERGE)
	private Role role;
	@OneToOne(cascade = CascadeType.ALL)
	private Order order;
	

}
