package com.trainmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.trainmicroservice.model.Train;

public interface TrainRepository extends MongoRepository<Train, Integer>
{
	public Train findByid(int id);
	 public Train findByname(String name);

}
