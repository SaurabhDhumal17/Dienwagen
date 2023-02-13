package com.deinwagen.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deinwagen.backend.dto.VehicleInformation;

@Service
public interface VehicleInformationService {

	List<VehicleInformation> filterVehicle(String modelName, String bodyType, String engineType);
}
