package com.deinwagen.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.deinwagen.backend.entities.Equipment;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface EquipmentRepository extends JpaRepository<Equipment, Long>{

}
