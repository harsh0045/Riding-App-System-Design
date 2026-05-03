package com.harsh.ridesharing;

public class Driver {

	 private String name;
	 private int pos;
	 private String status;
	 private Vehicle vehicle;
	 
	 public void requestReceivedForRide(Passenger p , int fair) {
		 System.out.println("Driver - " + this.getName()+"received request for ride by : " + p.getName()  );
		 this.acceptRide(p);
	 }

	 public void acceptRide(Passenger p) {
		 System.out.println("Request accepted by Driver :" + this.name);
		 p.requestAcceptedNotification(this);
	 }
	 
	 public void requestForOtptoStartRide(Passenger p, App app) {
		 System.out.println(this.name + "Driver request app to send otp for starting ride  to passenger:" + p.getName());
		 app.sendOtpToPassenger(p);
	 }
	 public void requestForVerifyOtp(Passenger p, int otp , App app) {
		 app.checkOtpByDriver(p,this,otp);
		
	 }
	 
	 public boolean isPaymentDoneByPassenger(Passenger p) {
		 System.out.println("Driver says yes i got the money and complete the ride");
		
		 return true;
	 }
	 public void completeRide() {
		 System.out.println("Ride Completed for Driver");
		 this.setStatus("Ride-Completed");
	 }
	 public String getName() {
		return name;
	 }

	 public void setName(String name) {
		this.name = name;
	 }

	 public int getPos() {
		return pos;
	 }

	 public void setPos(int pos) {
		this.pos = pos;
	 }

	 public String getStatus() {
		return status;
	 }

	 public void setStatus(String status) {
		this.status = status;
	 }

	

	 public Vehicle getVehicle() {
		return vehicle;
	 }

	 public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	 }
	  
}
