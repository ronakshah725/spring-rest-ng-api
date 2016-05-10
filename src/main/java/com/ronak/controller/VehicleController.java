package com.ronak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ronak.model.Vehicle;
import com.ronak.repository.VehicleRepository;

@RestController
@RequestMapping("/Vehicles")
public class VehicleController {
	@Autowired
	private VehicleRepository repo;

	/*****************CREATE******************/
	
	
	/**
	 * @param Vehicle
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Vehicle addVehicle(@RequestBody Vehicle Vehicle) {
		Vehicle.setId(null);
		return repo.saveAndFlush(Vehicle);
	}

	/*****************READ******************/


	/**
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Vehicle> findVehicles() {
		return repo.findAll();
	}


	/**
	 * @param Id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Vehicle findVehiclesById(@PathVariable Integer Id) {
		return repo.findOne(Id);
	}

	/**
	 * @param make
	 * @return
	 */
	@RequestMapping(value = "/{make}", method = RequestMethod.GET)
	public List<Vehicle> findVehiclesByMake(@PathVariable String make) {
		return repo.findByMake(make);
	}

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{model}", method = RequestMethod.GET)
	public List<Vehicle> findVehiclesByModel(@PathVariable String model) {
		return repo.findByModel(model);
	}

	/*****************UPDATE******************/
	
	/**
	 * @param updatedVehicle
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Vehicle updateVehicle(@RequestBody Vehicle updatedVehicle, @PathVariable Integer id) {
		updatedVehicle.setId(id);
		return repo.saveAndFlush(updatedVehicle);
	}

	/*****************DELETE******************/
	
	/**
	 * @param id
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteVehicle(@PathVariable Integer id) {
		repo.delete(id);
	}

}
