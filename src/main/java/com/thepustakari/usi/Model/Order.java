package com.thepustakari.usi.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Order_Table")
@Data
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Order_Id")
	private int orderId;
	@OneToMany
	@Column
	private List <Order_Item>order_item;
	@Column(name="Session_Id")
	private int sessionId;
	@Column(name="Token")
	private int token;
	@Column(name="Tax")
	private float tax;
	@Column(name="Sub_Total")
	private float subTotal;
	@Column(name="Item_Discount")
	private float itmeDiscount;
	@Column(name="Shipping_Cost")
	private float shipping;
	@Column(name="Total")
	private float total;
	@Column(name="Promo")
	private String promo;
	@Column(name="Discount")
	private float discount;
	@Column(name="Grand_Total")
	private float grandTotal;
	@Column(name="Created_At")
	private Date createdAt;
	@Column(name="Updated_At")
	private Date updatedAt;
	@Column(name="Comments")
	private String Text;
	
	
}
