package com.vastika.rating.data.service.model;

import java.time.LocalDateTime;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@JsonIgnore
	private final LocalDateTime createDate=LocalDateTime.now();
	@JsonIgnore
	@Column (name="LogInDateTime")
	private String loginDate;
	@JsonIgnore
	@Column (name="LogOffDateTime")
	private String logoffDate;
	@Column (name="Active")
	private String active;
	@OneToOne(cascade = CascadeType.MERGE)
	private Role role;
	@OneToOne(cascade = CascadeType.ALL)
	private Authentication authnetication;
	//@OneToMany (mappedBy = "userInfo", cascade=CascadeType.ALL, fetch=FetchType.EAGER)//the mappydeBy should be constructor name
//	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn (name="user_address_fk", referencedColumnName = "userId")
	@OneToMany (mappedBy = "userInfo", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Address> addresses;
}