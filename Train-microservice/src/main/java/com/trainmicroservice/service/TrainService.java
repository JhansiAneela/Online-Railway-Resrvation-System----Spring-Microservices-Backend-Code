package com.trainmicroservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trainmicroservice.model.Train;
import com.trainmicroservice.repository.TrainRepository;

@Service
public class TrainService
{
	@Autowired
	private TrainRepository repository;
	
	// Post methods
	public Train saveTrain(Train train)
	{
		return repository.save(train);
	}
	
	public List<Train> saveTrains(List<Train> trains)
	{
		return repository.saveAll(trains);
	}
	
	// Get methods
	
	public List<Train> getTrains()
	{
		return repository.findAll();
	}
	
	public Train getTrainByid(int id)
	{
		return repository.findByid(id);
	}
	
	public Train getTrainByname(String name)
	{
		return repository.findByname(name);
	}
	
	
	//Delete product by id
	public String deleteTrain(int id)
	{
		repository.deleteById(id);
		return "Train removed || "+id;
	}
	
	//put methods
	public Train updateTrain(Train train)
	{
		Train existingTrain=repository.findByid(train.getId());
		existingTrain.setName(train.getName());
		existingTrain.setTrainId(train.getTrainId());
		existingTrain.setSourceStation(train.getSourceStation());
		existingTrain.setDestinationStation(train.getDestinationStation());
		existingTrain.setType(train.getType());
		existingTrain.setSeats(train.getSeats());
		existingTrain.setArrives(train.getArrives());
		existingTrain.setDeparts(train.getDeparts());
		existingTrain.setFare(train.getFare());
		existingTrain.setDistance(train.getDistance());
		
		return repository.save(existingTrain);
		
	}
	
	
	
	
	
	
	
}