package com.vastika.rating.data.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="Role_Tbl")
@Data
public class Role {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="Role_id")
	private long Roleid;
	@Column(name="Role_Name")
	private String RoleName;
	

}
