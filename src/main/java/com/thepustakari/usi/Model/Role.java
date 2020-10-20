package com.thepustakari.usi.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Role_Table")
@Data 
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int RoleId;
	private String RoleName;
	

}
