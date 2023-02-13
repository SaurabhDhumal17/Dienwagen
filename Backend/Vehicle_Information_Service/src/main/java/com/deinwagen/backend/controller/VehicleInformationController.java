package com.deinwagen.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deinwagen.backend.dto.VehicleInformation;
import com.deinwagen.backend.service.VehicleInformationService;



@RestController
@RequestMapping("/vehicle")
public class VehicleInformationController {
	
	@Autowired
	VehicleInformationService vehicleInformationService;

	@GetMapping("/get/{modelName}/{bodyType}/{engineName}")
	List<VehicleInformation> filter(@PathVariable("modelName")String modelName,
			@PathVariable("bodyType")String bodyType,@PathVariable("engineName")String engineName){
	
		return vehicleInformationService.filterVehicle(modelName, bodyType, engineName);
	}
}
