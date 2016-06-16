package com.codeclan.cs;

public class Motorcycle extends Vehicle {

	private int gears;
	private int currentFuel;
	private int usedFuel;
	
	
	public Motorcycle(){
		this(new MotorbikeHorn());
		setGears(15);
		setCurrentFuel(150);
		
	}
	
	
	private Motorcycle(Ringable ringer){
		super(ringer);
	}


	public int getGears() {
		return gears;
	}


	public void setGears(int gears) {
		this.gears = gears;
	}


	public int getCurrentFuel() {
		return currentFuel;
	}


	public void setCurrentFuel(int currentFuel) {
		this.currentFuel = currentFuel;
	}
	
	public void newFuel(int currentFuel){
		this.currentFuel -= usedFuel;
	}
	
	
	
}
