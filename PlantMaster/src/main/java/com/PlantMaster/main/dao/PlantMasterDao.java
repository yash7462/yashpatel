package com.PlantMaster.main.dao;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.PlantMaster.main.beans.PlantMaster;
import com.PlantMaster.main.exception.ResourceNotFoundException;

public interface PlantMasterDao {

	public List<PlantMaster> readAllPlantMaster();

	public ResponseEntity<PlantMaster> readPlantMaster(long plantmasterId) throws ResourceNotFoundException;

	public PlantMaster addPlantMaster(PlantMaster plantmaster);

	ResponseEntity<PlantMaster> editPlantMaster(long plantmasterId, @Valid PlantMaster plantmaster)
			throws ResourceNotFoundException;

	public Map<String, Boolean> deletePlantMaster(long plantmasterId) throws Exception;

}
