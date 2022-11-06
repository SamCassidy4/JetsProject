package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {
	
	public CargoJet(String model, double speed, double range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = range / speed;
	}
	
	
	
	
	

	@Override
	public void loadCargo() {
		System.out.println("Loading Cargo");

	}

	public void fly() {
		System.out.println("Model: " + " " + model.toUpperCase() +" "+ " Speed: " + machSpeed() +" " + " Range: " + " " + range + " " + "Flight Time: "
				+ (int)flightTime + " hours ");
	}

	@Override
	public String toString() {
		return "Model:" + model + "\n Speed:" + machSpeed()+  "\nRange: " +  range + "miles" + " Price: " + "$" + price + "";
	}
}
