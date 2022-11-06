package com.skilldistillery.jets.entities;

public abstract class Jet {
	protected String model;
	protected double speed;
	protected double range;
	protected long price;
	protected boolean inFlight;
	protected double flightTime;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		
		return this.speed;
	}

	public double setSpeed(double speed) {
		return speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public boolean isInFlight() {
		return inFlight;
	}

	public void setInFlight(boolean inFlight) {
		this.inFlight = inFlight;
	}

	public double getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(double flightTime) {
		this.flightTime = flightTime;
	}

	public void fly() {
		System.out.println("Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ ", flightTime=" + flightTime + "]");
	}

	@Override
	public String toString() {
		return "Model:" + model + "\n Speed:" + speed + "MPH" + "\nRange: " + range + "miles" + " Price: " + "$" + price
				+ "";
	}

	protected double machSpeed() {
		double mach = 767;
		mach = (speed)/767;
		return mach;
		// 767 mph is equivalent to 1 mach

	}
}
