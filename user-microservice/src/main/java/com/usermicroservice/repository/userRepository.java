package com.usermicroservice.repository;

import com.usermicroservice.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface userRepository extends MongoRepository<user, Integer> 
{
	 public user findByEmailId(String emailId);
	 public user findByEmailIdAndPassword(String emailId, String password);

}

