package com.vastika.rating.data.service.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Table(name="UserInfo_Tbl")
@Data
public class UserInfo {
	
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_Id")
	private long userId;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@DateTimeFormat (pattern = "yyyy-MM-dd@HH:mm:ss")
	@Column (name="RegisteredDate")
	private Date createdate;
	//@DateTimeFormat (pattern = "yyyy-MM-dd@HH:mm:ss")
	@Column (name="LogInDateTime")
	private String logindate;
//	@DateTimeFormat (pattern = "yyyy-MM-dd@HH:mm:ss")
	@Column (name="LogOffDateTime")
	private String logoffdate;
	@Column (name="Active")
	private String active;
	@OneToOne(cascade = CascadeType.MERGE)
	private Role role;
	@OneToOne(cascade = CascadeType.ALL)
	private Authentication authnetication;
	//@OneToMany (mappedBy = "userInfo", cascade=CascadeType.ALL, fetch=FetchType.EAGER)//the mappydeBy should be constructor name
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn (name="user_address_fk", referencedColumnName = "userId")
	
	private List<Address> addresses;
}
