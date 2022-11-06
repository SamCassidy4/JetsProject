package com.skilldistillery.jets.entities;

public class UserJet extends Jet {

	public UserJet() {
		
	}
	public UserJet(String model, double speed, double range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = range / speed;
	}
	@Override
	public String toString() {
		return "Model:" + model + "\n Speed:" + machSpeed() + "\nRange: " +  range + "miles" + " Price: " + "$" + price + "";
	}
	public void fly() {
		System.out.println("Model: " + " " + model.toUpperCase() +" "+ " Speed: " + machSpeed() +" " + " Range: " + " " + range + " " + "Flight Time: "
				+ (int)flightTime + " hours ");
	}
	
}

