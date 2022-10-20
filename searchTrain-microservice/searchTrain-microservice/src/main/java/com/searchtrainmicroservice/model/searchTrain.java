package com.searchtrainmicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="TrainInfo")
public class searchTrain 
{
	@Id
	private int id;
	private String name;
	private String sourceStation;
	private String destinationStation;
	private String date;
	private double fare;
	
	
	public searchTrain() {}

	public searchTrain(int id,String name,String sourceStation,String destinationStation,String date,double fare)
	{
		super();
		this.id = id;
		this.name = name;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.date=date;
		this.fare=fare;
	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() 
	{
		return String.format("searchTrain[id='%s',name='%s',sourceStation='%s',destinationStation='%s',fare='%d']",id,name,sourceStation,destinationStation,fare);
		
	}
}
	
	
	
	
	
	
	
	

	