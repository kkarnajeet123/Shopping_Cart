package com.thepustakari.usi.Model;

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
	@Column
	private int userId;
	// @NotNull
	@Column
	private String email;
	// @NotNull
	@Column
	private String password;
	// @NotNull
	@Column
	private String FirstName;
	// @NotNull
	@Column
	private String LastName;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToOne(cascade = CascadeType.MERGE)
	private Role role;

}
