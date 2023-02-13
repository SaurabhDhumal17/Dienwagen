package com.deinwagen.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.deinwagen.backend.entities.Line;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface LineRepository extends JpaRepository<Line, Long>{
	
	List<Line> findByModelNameAndEngineNameAndNameContainingIgnoreCase(@RequestParam("modelName") String modelName,
			@RequestParam("engineName") String engineName,@RequestParam("bodyName") String bodyName);
	
	
	List<Line> findByModelName(@RequestParam("modelname") String modelname);
	
	List<Line> findByEngineName(@RequestParam("enginelname") String enginename);
	
	List<Line> findByNameContaining(@RequestParam("bodyname") String bodyname);
	
	List<Line> findByModelNameAndEngineName(@RequestParam("modelName") String modelName,
			@RequestParam("enginename") String enginename);

}
