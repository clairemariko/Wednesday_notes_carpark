package com.codeclan.cs;

public class Bicycle extends Vehicle {
	
	private int id;
	private int currentSpeed;
	private String name;
	private int currentGear;
	private int gears;
//	private Bell bell; we dont need this anymore because we have create it in the first constructor

	
//first constructor

	public Bicycle(){
		//we want to use our own constructor
		this(new Bell());
		//
		gears =21;
		colour = "Tomato";
		numberOfWheels = 2;
	}
	
//second constructor to make sure that not all bikes are the same colour 
	
	public Bicycle(String colour){
		this();
		this.colour = colour;
	}
	
	
	//third constructor that bring the parent object
	private Bicycle(Ringable ringer){
		super(ringer);
	}
	

	
	public int getId(){
		return id;
	}
	
	private void setId(int id){
		this.id = id;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public void setCurrentSpeed(int speed){
		this.currentSpeed = speed;
	}

	public void speedUp(int newSpeed) {
		currentSpeed += newSpeed;
	}
	
	
	
	@Override
	public String toString(){
		return "Bicycle: {Colour: "+colour+", Gears: "+gears+"}";
	}
	
	
}
