package com.harsh.ridesharing;

import java.util.ArrayList;
import java.util.List;

public class App {
   private List<Driver>drivers;
   private List<Passenger>passengers;
   private List<Vehicle>vehicles;
   private int otp;
   
   
   App(){
	   drivers=new ArrayList<>();
	   passengers=new ArrayList<>();
	   vehicles= new ArrayList<>();
	   otp=123;
   }
   
   public void registerDriver(Driver d) {
	   drivers.add(d);
   }
   public void registerPassenger(Passenger p) {
	   passengers.add(p);
   }
   public void registerVehicleTypeWithFairType(Vehicle v) {
	    vehicles.add(v);
   }
   public void selectAllVehicleWithFairType(int src, int des , Passenger p) {
	    int distance = Math.abs(src-des);
	    
	    List<Tuple>ans= new ArrayList<>();
	    for(Vehicle v : vehicles) {
	    	
	    	Tuple t = new Tuple(v.getVehicleType(),v.getFairType(),v.getFair(distance));
	    	ans.add(t);
	        
	    }
	    p.receivedOptions(ans,this);
   }

   public void notifyAllDriverWithSpecific(String vehicleType, String fairType ,int fair, Passenger p) {
	  System.out.println("App send notification to all drivers having this specific vehicle");
	   for(Driver d : drivers) {
		   if(d.getVehicle().getVehicleType().equals(vehicleType) && d.getVehicle().getFairType().equals(fairType)) {
			   d.requestReceivedForRide(p,fair);
		   }
	   }
   }

   public void askingForPaymentConfirmation(Passenger p, Driver d) {
	   System.out.println("App asking driver you got the payment or not");
	   boolean isOk =d.isPaymentDoneByPassenger(p);
	   if(isOk) {
		   System.out.println("As it is confirmed payment is done so app changed the status of ride for both");
		   
		   p.completeRide();
		   d.completeRide();
		   
		   
	   }

   }

   public void sendOtpToPassenger(Passenger p) {
	  System.out.println("App send otp to passenger :" + p.getName());
	  
	  p.receivedOTP(otp);
	
   }

   public boolean checkOtpByDriver(Passenger p,Driver d, int otp) {
       if(this.otp==otp) {
    	   System.out.println("Otp is correct checked by app and changed the status of ride");
    	   p.setStatus("Ongoing");
    	   d.setStatus("Ongoing");
    	   return true;
       }
	return false;
   }

  

  

 
}
