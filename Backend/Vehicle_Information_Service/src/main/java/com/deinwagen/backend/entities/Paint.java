package com.deinwagen.backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "VEHICLE_PAINT")
public class Paint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PAINT_ID")
	private long id;
	
	@Column(name = "PAINT_NAME")
	private String name;
	
	@Column(name = "PAINT_TYPE")
    private String type;
	
	
	@ManyToOne
	@JoinColumn(name = "MODEL_ID")
    private Model model;
	
	@Column(name = "PRICE")
	private int price;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
	
	@Column(name = "LAST_UPDATED_TIME")
	@UpdateTimestamp
    private Date lastUpdatedTime;
}
