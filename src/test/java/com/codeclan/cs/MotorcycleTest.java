package com.codeclan.cs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MotorcycleTest {
	
	 @Test
	    public void testMotorcycleWarning(){
	    	Motorcycle m = new Motorcycle();
	    	System.out.println(m.giveWarning());
	    }
	    
	    @Test
	    public void testMotorcycleWarningFail(){
	    	Motorcycle m = new Motorcycle();
	    	System.out.println(m.giveWarning());
	    }

	    
//	    @Test
//	    public void testnewFuel(){
//	    	Motorcycle m = new Motorcycle();
//	    	int usedFuel = 100;
//	    	int currentFuel= 150;
//	    	m.newFuel(currentFuel-usedFuel);
//	    	assertEquals(50, m.newFuel);
//	    }
	    
	    
	    
}
