package com.harsh.ridesharing;

public class Bike implements Vehicle {
   
	
	
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
			return 10*dist;
		}else if(this.getFairType()=="Shared") {
			return 15*dist;
		}else {
			return 20*dist;
		}
		
	}

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return vehicletype;
	}


	@Override
	public void setFairType( String fairtype) {
		// TODO Auto-generated method stub
		this.fairtype=fairtype;
	}

	@Override
	public void setVehicleType(String v) {
		this.vehicletype=v;
		// TODO Auto-generated method stub
		
	}

}
