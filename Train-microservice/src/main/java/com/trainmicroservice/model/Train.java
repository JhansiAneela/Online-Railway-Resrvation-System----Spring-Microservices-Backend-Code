package com.trainmicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TrainInfo")
public class Train 
{
	@Id
	private int id;
	private String name,trainId,sourceStation,destinationStation,type;
	private int seats,arrives,departs;
	private double fare,distance;
	
	public Train(int id,String name,String trainId,String sourceStation,String destinationStation,String type,int seats,int arrives,int departs,double fare,double distance)
	{
		super();
		this.id = id;
		this.name = name;
		this.trainId = trainId;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.type = type;
		this.seats = seats;	
		this.arrives = arrives;
		this.departs = departs;
		this.fare=fare;
		this.distance=distance;
		
	}
	public Train() {}
	
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
	public String getTrainId() {
		return trainId;
	}
	public void setTrainId(String trainId) {
		this.trainId = trainId;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getArrives() {
		return arrives;
	}
	public void setArrives(int arrives) {
		this.arrives = arrives;
	}
	public int getDeparts() {
		return departs;
	}
	public void setDeparts(int departs) {
		this.departs = departs;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() 
	{
		return String.format("Train[id='%s',name='%s',trainId='%s',sourceStation='%s',destinationStation='%s',type='%s',seats='%d',arrives='%d',departs='%d',fare='%d',distance='%d']",id,name,trainId,sourceStation,destinationStation,type,seats,arrives,departs,fare,distance);
		
	}
	
}