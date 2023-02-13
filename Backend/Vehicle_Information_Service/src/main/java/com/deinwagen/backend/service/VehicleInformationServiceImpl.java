package com.deinwagen.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deinwagen.backend.dao.BodyRepository;
import com.deinwagen.backend.dao.EngineRepository;
import com.deinwagen.backend.dao.ModelRepository;
import com.deinwagen.backend.dto.VehicleInformation;
import com.deinwagen.backend.entities.Body;
import com.deinwagen.backend.entities.Engine;
import com.deinwagen.backend.entities.Model;

@Service
public class VehicleInformationServiceImpl implements VehicleInformationService {

	@Autowired
	private ModelRepository modelRepository;
	
	@Autowired
	private EngineRepository engineRepository;
	
	@Autowired
	private BodyRepository bodyRepository;
	
	@Override
	public List<VehicleInformation> filterVehicle(String modelName, String bodyType, String engineType) {
		
		Model model = modelRepository.findByName(modelName);
		Body body= bodyRepository.findByType(bodyType);
	    Engine engine=engineRepository.findByName(engineType);
	    

		List<VehicleInformation> vehicleInformations= new ArrayList<>();
		
		VehicleInformation vehicleInformation= new VehicleInformation();
		
		if(model.getBodies().contains(body) && model.getEngines().contains(engine)) {
			
			vehicleInformation.setLineName(modelRepository.findByName(modelName).getName());
			vehicleInformation.setBodyType(bodyRepository.findByType(bodyType).getType());
			vehicleInformation.setEngineType(engineRepository.findByName(engineType).getName());
			vehicleInformations.add(vehicleInformation);	
		}
		
		else {
			System.out.println(model);
			System.out.println(body);
			System.out.println(engine);
		}
		
		
	
		return vehicleInformations;
	}

}
