package com.codeclan.cs;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class BicycleTest 
{
    @Test
    public void testBicycle(){
    	Bicycle b = new Bicycle();
    	assertTrue(b.getCurrentSpeed()==0);
    }
    
    @Test
    public void testSpeedUp(){
    	Bicycle b = new Bicycle();
    	int newSpeed = 10;
    	b.speedUp(newSpeed);
    	assertTrue(b.getCurrentSpeed()==newSpeed);
    }
    
 //this will console out an object id with the artifact id. this is calling the perant method 
    //and we want to implement the child toString
    @Test
    public void testDisplayBicycle(){
    	Bicycle b = new Bicycle();
    	System.out.println(b);
    }
    
    @Test
    public void testBicycleWarning(){
    	Bicycle b = new Bicycle();
    	System.out.println(b.giveWarning());
    }
    
    @Test
    public void testBicycleWarningFail(){
    	Bicycle b = new Bicycle();
    	System.out.println(b.giveWarning());
    }
}








