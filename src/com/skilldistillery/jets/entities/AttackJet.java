package com.skilldistillery.jets.entities;

public class AttackJet extends Jet implements CombatReady {
	public AttackJet(String model, double speed, double range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = range / speed;
	}

	public void fly() {
		System.out.println("Model: " + " " + model.toUpperCase() +" "+ " Speed: " + machSpeed() +" " + " Range: " + " " + range + " " + "Flight Time: "
				+ (int)flightTime + " hours ");

	}

	@Override
	public void fight() {

	}

	@Override
	public String toString() {
		return "Model:" + model + "\n Speed:" + machSpeed() +  "\nRange: " +  range + "miles" + " Price: " + "$" + price + "";
	}
}
