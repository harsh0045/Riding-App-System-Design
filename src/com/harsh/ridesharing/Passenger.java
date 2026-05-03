package com.harsh.ridesharing;

import java.util.List;

class Tuple{
	String type;
	String standard;
	int fair;
	
	public Tuple(String type,String standard,int fair) {
		this.type=type;
		this.standard=standard;
		this.fair=fair;
	}
}

public class Passenger {
   private String name;
   private int pos;
   private String status;
  
   public void requestForOptions(int pos,int des , App app) {
	   System.out.println("Passenger: " + this.name + "  request app for all vehicle type ");
	   app.selectAllVehicleWithFairType(pos,des,this);
   }
   
   public void receivedOptions(List<Tuple>v, App app) {
	   String selectedType="";
	   String selectedStandard="";
	   int selectedFair=0;
	   boolean ck=false;
	   for(Tuple t : v) {
		   if(!ck) {
			   ck=true;
			   selectedType= t.type;
			   selectedStandard=t.standard;
			  selectedFair=t.fair;
			  
		   }
		   System.out.println("VehicleType-" + t.type +" Standard- " + t.standard + "Fair" + t.fair);
	   }
	   this.requestForSelectedOptions(selectedType,selectedStandard,selectedFair,app);
   }
   
   public void requestForSelectedOptions(String vehicleType,String fairType, int fair, App app) {
	   System.out.println("Passenger send request to app for this specific vehicle type and fairtype vehicle");
	   app.notifyAllDriverWithSpecific(vehicleType,fairType,fair,this);
   }

   public void requestAcceptedNotification(Driver d) {
	   System.out.println("Driver -" + d.getName() +" : Accepted your ride. He is coming wait.");
   }
   
   public void receivedOTP(int otp) {
	   System.out.println("Passenger got otp :" + otp);
   }
   
   public void makePayment(Driver d , App app) {
	  System.out.println("Passenger make payment and requested app to check driver got the money or not");
	  app.askingForPaymentConfirmation(this,d);
	 
   }
   public void completeRide() {
	   System.out.println("Ride Completed for passenger");
	   this.setStatus("Ride-Completed");
   }
   
   public int getPos() {
	return pos;
   }

   public void setPos(int pos) {
	this.pos = pos;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public String getStatus() {
	return status;
   }

   public void setStatus(String status) {
	this.status = status;
   }
   
   
}
