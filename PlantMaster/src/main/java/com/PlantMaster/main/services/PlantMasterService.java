package com.PlantMaster.main.services;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.PlantMaster.main.beans.PlantMaster;
import com.PlantMaster.main.exception.ResourceNotFoundException;

public interface PlantMasterService {
	public PlantMaster addPlantMaster(PlantMaster plantmaster);
	
	public ResponseEntity<PlantMaster> editPlantMaster(PlantMaster plantmaster,long plantmasterId) throws ResourceNotFoundException;
	
	public Map<String, Boolean> deletePlantMaster(long plantmasterId) throws Exception;
	
	public ResponseEntity<PlantMaster> readPlantMaster(long plantmastrId) throws ResourceNotFoundException;
	
	public List<PlantMaster> readAllPlantMaster();
		
}
