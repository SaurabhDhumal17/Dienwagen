package com.deinwagen.backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "LOGIN_DETAILS")
public class LoginDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long id;
    
	@Column(name = "USER_NAME") 
    private String name;

	@Column(name = "PWD")
    private String password;
	
	@ManyToOne
	@JoinColumn(name = "DEALER_ID",nullable = false)
	private DealerDetails dealerId;
	
	@OneToOne
	private Roles role;
	
	@Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
	
	@Column(name = "LAST_UPDATED_TIME")
    private Date lastUpdatedTime;
}
