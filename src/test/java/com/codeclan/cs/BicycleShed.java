package com.codeclan.cs;

import java.util.ArrayList;

public class BicycleShed {
	//this is a generic where you can pass in an object. We want an Arraylist but we only
	//want to store the object Bicycle. it can ONLY store object, ref types. We cant store primitives
	//but we can store wrapper. so if we want to store int we will have to do Integer in order for it to store. 
	
	ArrayList<Bicycle> myBicycleShed; //myBicycleShed is an instance
	
	public BicycleShed() {
		myBicycleShed = new ArrayList<Bicycle>();
		
	}
	
	//.add are just on arrayList which is .push and it pushes it to the end
	public boolean addBicycle(Bicycle myBike){
		return myBicycleShed.add(myBike);
	}
	
	//when removing it removes the WHOLE object and destroy it. REMEMBER use .size
	//not .length for ArrayLists
	public void removeBicycle(Bicycle myBike){
		for (int i=0; i<myBicycleShed.size(); i++) {
			Bicycle  currentBicycle = myBicycleShed.get(i);
			if (currentBicycle.getId()==myBike.getId()){
				myBicycleShed.remove(currentBicycle);
			}
		}
	}
	//this is overload they can be named the same thing and have the same purpose just 
	//different methods to do it
	public void removeBicycle(int index){
		myBicycleShed.remove(index);
	}
}
