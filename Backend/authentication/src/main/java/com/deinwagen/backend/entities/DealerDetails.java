package com.deinwagen.backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DEALER_DETAILS")
public class DealerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEALER_ID")
	private Long id;
    
	@Column(name = "DEALER_NAME") 
    private String name;

	@Column(name = "ADDRESS")
    private String address;
	
	@Column(name = "CONTACT_NO")
    private String mobileNumber;
	
	@Column(name = "EMAIL_ID")
    private String emailId;
	
	@Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
	
	@Column(name = "LAST_UPDATED_TIME")
    private Date lastUpdatedTime;
}
