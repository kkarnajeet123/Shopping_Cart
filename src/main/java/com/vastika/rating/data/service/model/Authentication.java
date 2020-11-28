package com.vastika.rating.data.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Authentication_Tbl")
@Data
@Component

public class Authentication {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Authentication_Id")
	private long AuthenticationID;
	@Column(name="user_name")
	private String Username;
	@Column(name="password")
	private String Password;
	
}
