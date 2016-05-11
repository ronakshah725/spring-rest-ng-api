package com.ronak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronak.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	List<Vehicle> findByMake(String make);
	
	List<Vehicle> findByModel(String model);
	

	List<Vehicle> findByYear(int year);
	
}
