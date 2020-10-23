package com.thepustakari.usi.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
	@Column(name="date_stamp")
	private Date date;
	
	@ManyToOne
	private Product item;
	
}
