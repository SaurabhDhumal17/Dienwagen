package com.deinwagen.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.deinwagen.backend.entities.Model;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface ModelRepository extends JpaRepository<Model, Long>{

//	Model findByName(@Param("name") String name);
	
	Model findByName(String name);

	
	
	
	
	
}
