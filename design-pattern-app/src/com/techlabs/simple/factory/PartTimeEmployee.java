package com.techlabs.simple.factory;

public class PartTimeEmployee implements Employee {

	private double hourlyRate;

	public PartTimeEmployee(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double getHourlyRate() {
		return hourlyRate;
	}
}
