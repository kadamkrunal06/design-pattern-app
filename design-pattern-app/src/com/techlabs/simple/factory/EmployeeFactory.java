package com.techlabs.simple.factory;

public class EmployeeFactory {
	public static Employee getEmployee(int hoursAllocated, double hourlyRate) {

		if (hoursAllocated >= 40) {
			System.out
					.println("This is Full Time Employee and his hourly Rate is :");
			return new FullTimeEmployee(hourlyRate);
		} else {
			System.out
					.println("This is Part Time Employee and his hourly Rate is :");
			return new PartTimeEmployee(hourlyRate);
		}
	}
}
