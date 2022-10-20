package com.searchtrainmicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.searchtrainmicroservice.model.searchTrain;
import com.searchtrainmicroservice.repository.searchTrainRepository;



@Service
public class searchTrainService
{
	@Autowired
	private searchTrainRepository repository;

		
		// Get methods
		
		public List<searchTrain> getTrains()
		{
			return repository.findAll();
		}
		
		public searchTrain getTrainByid(int id)
		{
			return repository.findByid(id);
		}
		
		public searchTrain getTrainByname(String name)
		{
			return repository.findByname(name);
		}
		
		

}
