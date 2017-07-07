package com.techlabs.simple.factory.test;

import com.techlabs.simple.factory.Employee;
import com.techlabs.simple.factory.EmployeeFactory;

abstract class SimpleFactoryDesignTester {
	public static void main(String args[]) {
		Employee employee = EmployeeFactory.getEmployee(30, 25.0);

		System.out.println(employee.getHourlyRate());

		employee = EmployeeFactory.getEmployee(40, 15.45);

		System.out.println(employee.getHourlyRate());
	}
}
