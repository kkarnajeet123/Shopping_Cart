package com.thepustakari.usi.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Photo_Table")
@Data
public class Photo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int photoId;
	@Column
	private String photographer;
	@Column
	private String path;
	@Column
	private String fileName;
	@Column
	private String comments;
	@Column
	private Date date;
	
}
