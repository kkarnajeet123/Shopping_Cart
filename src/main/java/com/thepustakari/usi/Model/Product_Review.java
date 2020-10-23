package com.thepustakari.usi.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Product_Review_Table")
@Data
public class Product_Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Product_Review_Id")
	private int productReviewId;
	
	private String title;
	private int rating;
	private Date DateTime;
	private String Text;
	

}
