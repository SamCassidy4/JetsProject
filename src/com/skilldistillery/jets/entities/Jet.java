package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double speed;
	private double range;
	private long price;

	public void fly() {
		System.out.println("WHOOOSH, Flying!");

	}
}
