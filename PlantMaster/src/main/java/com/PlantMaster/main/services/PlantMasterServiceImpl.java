package com.PlantMaster.main.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PlantMaster.main.beans.PlantMaster;
import com.PlantMaster.main.dao.PlantMasterDao;
import com.PlantMaster.main.exception.ResourceNotFoundException;

@Service("PlantMasterService")
public class PlantMasterServiceImpl implements PlantMasterService {

	@Autowired
	PlantMasterDao plantmasterDao;

	@Override
	public PlantMaster addPlantMaster(PlantMaster plantmaster) {
		return plantmasterDao.addPlantMaster(plantmaster);
	}

	public ResponseEntity<PlantMaster> editPlantMaster(PlantMaster plantmaster, long plantmasterId) throws ResourceNotFoundException {
		return plantmasterDao.editPlantMaster(plantmasterId, plantmaster);
	}

	public ResponseEntity<PlantMaster> deletePlantMaster(long plantmasterId) throws Exception {
		return plantmasterDao.deletePlantMaster(plantmasterId);
	}

	public ResponseEntity<PlantMaster> readPlantMaster(long plantmasterId) throws ResourceNotFoundException {
		return plantmasterDao.readPlantMaster(plantmasterId);
	}

	public List<PlantMaster> readAllPlantMaster() {
		return plantmasterDao.readAllPlantMaster();
	}

}
