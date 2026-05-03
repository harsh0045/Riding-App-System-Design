package com.harsh.ridesharing;

public class Main {
	 public static void main(String[] args) {
	        App app = new App();
	        Passenger p1 = new Passenger();
	        p1.setName("Harsh");
	        p1.setPos(0);
	        p1.setStatus("Pending");
	        
	        
	        Vehicle v1 = new Car();
	        v1.setFairType("Simple");
	        v1.setVehicleType("Car");
	        
	        Driver d1 = new Driver();
	        d1.setName("Ashish");
	        d1.setPos(0);
	        d1.setStatus("Pending");
	        d1.setVehicle(v1);
	        
	        app.registerDriver(d1);
	        app.registerPassenger(p1);
	        app.registerVehicleTypeWithFairType(v1);
	        
	        p1.requestForOptions(0, 1, app);
	        d1.requestForOtptoStartRide(p1, app);
	        d1.requestForVerifyOtp(p1, 123, app);
	        p1.makePayment(d1, app);
	  }
}
