package com.searchtrainmicroservice.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.searchtrainmicroservice.model.searchTrain;


public interface searchTrainRepository extends MongoRepository<searchTrain, Integer>
{
	public searchTrain findByid(int id);
	public searchTrain findByname(String name);
	 
}


