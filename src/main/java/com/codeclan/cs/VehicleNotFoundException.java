package com.codeclan.cs;

public class VehicleNotFoundException extends Exception {

//	public VehicleNotFoundException(){
//		super("There was a problem locating vehicle.");
//	}
	
	public VehicleNotFoundException(Vehicle v){
		super("There was a problem locating vehicle: "+v);
	}
}
