package com.techlabs.simple.factory;

public class FullTimeEmployee implements Employee {
	private double hourlyRate;

	public FullTimeEmployee(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double getHourlyRate() {
		return hourlyRate;
	}
}
