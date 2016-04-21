package com.codeclan.cs;
import org.junit.*;
import static org.junit.Assert.*;

public class CarParkTest {
	
	//global var
	Vehicle v;
	CarPark cp;
	
	@Before
	public void setup(){
		Vehicle v = new Car("A12 3DFF");
		cp = new CarPark();
	}
	

	@Test
	public void testExitCarSuccess(){
		Vehicle v = new Car("A12 3DFF");
		CarPark cp = new CarPark();
		cp.park(v);
		assertTrue(cp.getCarPark().size()==1);
		boolean hasExited = false;
		
		try {
			hasExited = cp.exit(v);
		} catch (VehicleNotFoundException e) {
			System.err.println(e.getMessage());
			fail("Vehicle not found!");
		}
		assertTrue(hasExited);
	}
	
	@Test(expected = VehicleNotFoundException.class)
	public void testExitUnsuccessful() throws VehicleNotFoundException {
		Vehicle v = new Car("AB3 4GH");
		CarPark cp = new CarPark();
		
		
		try{
			cp.exit(v);
			fail("Exception wasn't thrown");
		} catch(VehicleNotFoundException e){
			System.err.println(e.getMessage());
			throw new VehicleNotFoundException(v);
		}
	}
}








