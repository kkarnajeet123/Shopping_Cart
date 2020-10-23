package com.thepustakari.usi.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Transaction_Table")
@Data

public class Transaction {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_id")
	private int transactionId;
	//@ManyToOne
	//private UserInfo userinfo;
	//@ManyToOne
	//private Order order;
	@Column(name="payment_gateway_id")
	private String code;
	@Column(name= "Payment_Type")
	private int Type;
	@Column(name="Payment_Mode")
	private int mode;
	@Column(name="Status")
	private int status;
	@Column(name="Created_At")
	private Date createdAt;
	@Column(name="Updated_At")
	private Date updatedAt;
	@Column(name="Comments")
	private String text;
	
}
