package com.deinwagen.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ROLES")
public class Roles {

	@Id
	@Column(name = "ROLE_ID")
	private Long id;
    
	@Column(name = "ROLE_NAME") 
    private String name;
}
