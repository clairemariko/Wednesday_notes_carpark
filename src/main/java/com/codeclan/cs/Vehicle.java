package com.codeclan.cs;

public abstract class Vehicle {

	protected int numberOfWheels;
	protected String model;
	protected String registration;
	protected int maximumSpeed;
	protected String colour;
	protected int maxOccupance;
	protected int speed;
	protected Ringable ringer;
	
	//constructors
	protected Vehicle(){
		speed = 5;
	}
	//constructor for the ringable interface
	protected Vehicle(Ringable ringer){
		this.ringer = ringer;
	}
	
	//method that will go down to the children
	public String giveWarning(){
		return ringer.makeSound();
	}
	
	//this is not abstract as its not a behaviour
	//getters and setters
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMaxOccupance() {
		return maxOccupance;
	}

	public void setMaxOccupance(int maxOccupance) {
		this.maxOccupance = maxOccupance;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public String toString(){
		return "Vehicle: {Registration: "+registration+", Models: "+model+"}";
	}
}
