package com.harsh.ridesharing;

public class Car implements Vehicle {

	private String fairtype;
	private String vehicletype;
	@Override
	public String getFairType() {
		// TODO Auto-generated method stub
		return fairtype;
	}

	@Override
	public int getFair(int dist) {
		// TODO Auto-generated method stub
		if(this.getFairType()=="Simple") {
			return 20*dist;
		}else if(this.getFairType()=="Shared") {
			return 25*dist;
		}else {
			return 30*dist;
		}
	
	}

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return vehicletype;
	}

	@Override
	public void setFairType(String fairtype) {
		this.fairtype=fairtype;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVehicleType(String v) {
		// TODO Auto-generated method stub
		this.vehicletype=v;
		
	}
   
}
