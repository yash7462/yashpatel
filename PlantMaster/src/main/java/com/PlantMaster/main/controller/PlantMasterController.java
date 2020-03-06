package com.PlantMaster.main.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PlantMaster.main.beans.PlantMaster;
import com.PlantMaster.main.exception.ResourceNotFoundException;
import com.PlantMaster.main.services.PlantMasterService;


@RestController
@RequestMapping("/plantmaster")
public class PlantMasterController {
	
	
	@Autowired
	private PlantMasterService plantmasterservice;
	
	/**
	 * Show all PlantMaster Details
	 * @param m
	 * @return
	 */
	@GetMapping("/")
	public List<PlantMaster> readAllPlantMaster() {
		//m.addAttribute("list", plantmasterservice.readAllPlantMaster());
		return plantmasterservice.readAllPlantMaster();
	}
	
	/**
	 * 
	 * @param plantmasterId
	 * @return
	 * @throws ResourceNotFoundException
	 */
	@GetMapping("/{plantmasterId}")
	public ResponseEntity<PlantMaster> getPlantMasterById(@PathVariable(value = "plantmasterId") long plantmasterId,Model m)
			throws ResourceNotFoundException {		
		return plantmasterservice.readPlantMaster(plantmasterId);
		}
	
	@PostMapping("/")
	public PlantMaster createPlantMaster(@Valid @RequestBody PlantMaster plantmaster) {
		
		return plantmasterservice.addPlantMaster(plantmaster);
	
	}
	
	@PutMapping("/{plantmasterId}")
	public ResponseEntity<PlantMaster> updatePlantMaster(@PathVariable(value = "plantmasterId") long plantmasterId,
			@Valid @RequestBody PlantMaster plantmaster) throws ResourceNotFoundException {
		
		 return plantmasterservice.editPlantMaster(plantmaster, plantmasterId);
	}
	
	@DeleteMapping("/{plantmasterId}")
	public ResponseEntity<PlantMaster> deletePlantMaster(@PathVariable(value = "plantmasterId") long plantmasterId) throws Exception {
		return plantmasterservice.deletePlantMaster(plantmasterId);
	}

}
