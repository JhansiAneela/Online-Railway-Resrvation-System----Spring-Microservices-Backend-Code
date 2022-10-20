package com.trainmicroservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainmicroservice.model.Train;


@SpringBootApplication
@EnableEurekaClient

public class TrainMicroserviceApplication
{
	

	public static void main(String[] args) 
	{
		SpringApplication.run(TrainMicroserviceApplication.class, args);
	}

}
