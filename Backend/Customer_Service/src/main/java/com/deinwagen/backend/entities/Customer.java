package com.deinwagen.backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Table(name = "CUSTOMER_DETAILS")
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUST_ID")
	private long id;
	
	@Column(name = "CUST_NAME")
	private String name;
	
	@Column(name = "MOBILE_NO")
	private String mobileNumber;
	
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "ADDRESS")
	@Embedded
	private Address address;
	
	@Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
	
	@Column(name = "LAST_UPDATED_TIME")
	@UpdateTimestamp
    private Date lastUpdatedTime;

}
