package com.deinwagen.backend.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "VEHICLE_MODEL")
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MODEL_ID")
	private long id;
	
	@Column(name = "MODEL_NAME")
    private String name;
	
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
	
	@Column(name = "LAST_UPDATED_TIME")
	@UpdateTimestamp
    private Date lastUpdatedTime;
	
	@JsonIgnore
	@OneToMany(mappedBy = "model")
	private List<Body> bodies=new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "model")
	private List<Engine> engines=new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "model")
	private List<Line> lines=new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "model")
	private List<Paint> paints=new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "model")
	private List<Equipment> equipments=new ArrayList<>();
}
