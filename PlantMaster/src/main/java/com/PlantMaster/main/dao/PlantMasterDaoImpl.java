package com.PlantMaster.main.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.PlantMaster.main.beans.PlantMaster;
import com.PlantMaster.main.exception.ResourceNotFoundException;
import com.PlantMaster.main.repository.PlantMasterRepository;

@Component
@Qualifier("PlantMasterDao")
public class PlantMasterDaoImpl implements PlantMasterDao {
	@Autowired
	private PlantMasterRepository plantmasterepository;


	public PlantMaster addPlantMaster(@Valid @RequestBody PlantMaster plantmaster) {
			return plantmasterepository.save(plantmaster);
		}

	@Override
		public ResponseEntity<PlantMaster> editPlantMaster(@PathVariable(value = "plantmasterId") long plantmasterId,
				@Valid @RequestBody PlantMaster plantmasterDetails) throws ResourceNotFoundException {
		PlantMaster pm = plantmasterepository.findById(plantmasterId)
					.orElseThrow(() -> new ResourceNotFoundException("Plant Master not found on : " + plantmasterId));
			pm.setFirstName(plantmasterDetails.getFirstName());
			pm.setLastName(plantmasterDetails.getLastName());
			pm.setGender(plantmasterDetails.getGender());
			pm.setDateofbirth(plantmasterDetails.getDateofbirth());
			pm.setPrimarymobileno(plantmasterDetails.getPrimarymobileno());
			pm.setSecondarymobileno(plantmasterDetails.getSecondarymobileno());
			pm.setExperience(plantmasterDetails.getExperience());
			pm.setHouseNo(plantmasterDetails.getHouseNo());
			pm.setStreetName(plantmasterDetails.getStreetName());
			pm.setArea(plantmasterDetails.getArea());
			pm.setCity(plantmasterDetails.getCity());
			pm.setPincode(plantmasterDetails.getPincode());
			pm.setUpdatedAt(plantmasterDetails.getUpdatedAt());
			
			final PlantMaster updatedPlantMaster = plantmasterepository.save(pm);
			return ResponseEntity.ok(updatedPlantMaster);
		
	}

	@Override
	public Map<String, Boolean> deletePlantMaster(@PathVariable(value = "plantmasterId") long plantmasterId) throws Exception {
		PlantMaster plantmaster = plantmasterepository.findById(plantmasterId)
				.orElseThrow(() -> new ResourceNotFoundException(" plantmaster not found  on : " + plantmasterId));
		plantmasterepository.delete(plantmaster);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@Override
	public ResponseEntity<PlantMaster> readPlantMaster(@PathVariable(value = "plantmasterId") long plantmasterId) throws ResourceNotFoundException {
		PlantMaster plantmaster = plantmasterepository.findById(plantmasterId)	.orElseThrow(() -> new ResourceNotFoundException("plantmaster not found on : " + plantmasterId));
		return ResponseEntity.ok().body(plantmaster);
	}
	
	@Override
	public List<PlantMaster> readAllPlantMaster() {
		return plantmasterepository.findAll();
	}
}
