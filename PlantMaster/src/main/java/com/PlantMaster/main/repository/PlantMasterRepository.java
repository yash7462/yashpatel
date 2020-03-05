package com.PlantMaster.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlantMaster.main.beans.PlantMaster;

public interface PlantMasterRepository 
extends JpaRepository<PlantMaster, Long>{

}
