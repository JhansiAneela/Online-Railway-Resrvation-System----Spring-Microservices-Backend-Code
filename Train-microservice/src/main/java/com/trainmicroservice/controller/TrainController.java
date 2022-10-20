package com.trainmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trainmicroservice.model.Train;
import com.trainmicroservice.service.TrainService;

@RestController

public class TrainController
{
	
	@Autowired
	private TrainService service;
	
	@PostMapping("/addTrain")
	@CrossOrigin(origins="http://localhost:4200")
	public Train addTrain(@RequestBody Train train)
	{
		return service.saveTrain(train);
	}
	
	@PostMapping("/addTrains")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Train> addTrains(@RequestBody List<Train> trains)
	{
		return service.saveTrains(trains);
	}
	
	@GetMapping("/Trains")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Train> findAllTrains()
	{
		return service.getTrains();
	}
	
	@GetMapping("/TrainById/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public Train findTrainByid(@PathVariable int id)
	{
		return service.getTrainByid(id);
	}
	
	@GetMapping("/TrainByname/{name}")
	@CrossOrigin(origins="http://localhost:4200")
	public Train findTrainByname(@PathVariable String name)
	{
		return service.getTrainByname(name);
	}
	
	@PutMapping("/updateTrain")
	@CrossOrigin(origins="http://localhost:4200")
	public Train updateTrain(@RequestBody Train train)
	{
		return service.updateTrain(train);
	}
	
	@DeleteMapping(("/delete/{id}"))
	@CrossOrigin(origins="http://localhost:4200")
	public String deleteTrain(@PathVariable int id)
	{
		return service.deleteTrain(id);
	}
	
	
	
	
}