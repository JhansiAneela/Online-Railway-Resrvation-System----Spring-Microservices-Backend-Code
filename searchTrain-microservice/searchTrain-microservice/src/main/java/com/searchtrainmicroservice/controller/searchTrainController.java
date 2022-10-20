package com.searchtrainmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.searchtrainmicroservice.model.searchTrain;
import com.searchtrainmicroservice.service.searchTrainService;


@RestController
public class searchTrainController
{
	
	@Autowired
	private searchTrainService service;
	
	@GetMapping("/searchTrains")
	@CrossOrigin(origins="http://localhost:4200")
	public List<searchTrain> findAllTrains()
	{
		return service.getTrains();
	}
	
	@GetMapping("/searchTrainById/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public searchTrain findTrainByid(@PathVariable int id)
	{
		return service.getTrainByid(id);
	}
	
	@GetMapping("/searchTrainByname/{name}")
	@CrossOrigin(origins="http://localhost:4200")
	public searchTrain findTrainByname(@PathVariable String name)
	{
		return service.getTrainByname(name);
	}

}
