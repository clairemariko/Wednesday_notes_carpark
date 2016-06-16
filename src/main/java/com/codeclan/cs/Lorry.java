package com.codeclan.cs;

public class Lorry extends Vehicle{
	
	public Lorry(){
		this(new Horn());
	}


	
	private Lorry(Ringable ringer){
		super(ringer);
	}
	
}
