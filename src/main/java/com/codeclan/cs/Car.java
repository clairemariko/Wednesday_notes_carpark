package com.codeclan.cs;

public class Car extends Vehicle{

	private int numberOfDoors;
	
	public Car(){
		//calling the constructor in your parent
		
		numberOfDoors =5;
	}
	public Car(String registration){
		
		this.registration = registration;
	}
}
