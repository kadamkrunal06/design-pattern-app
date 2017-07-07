package com.techlabs.composite.patterntest;

import com.techlabs.composite.pattern.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee CEO = new Employee("Santosh", "CEO", 50000);
		Employee headSales = new Employee("Sanket", "Head Sales", 40000);
		Employee headMarketing = new Employee("Mayur", "Head Marketing", 40000);
		Employee clerk1 = new Employee("Ajay", "Cleark 1", 30000);
		Employee clerk2 = new Employee("Kote", "Head Sales", 30000);
		Employee salesExecutive1 = new Employee("Manish", "Sales Executive",
				20000);
		Employee salesExecutive2 = new Employee("Bane", "Sales Executive 2",
				20000);
		CEO.addEmployee(headMarketing);
		CEO.addEmployee(headSales);
		headMarketing.addEmployee(salesExecutive1);
		headMarketing.addEmployee(salesExecutive2);
		headSales.addEmployee(clerk1);
		headSales.addEmployee(clerk2);
		System.out.println(CEO);

		for (Employee headEmployee : CEO.subordinates) {

			System.out.println(headEmployee);
			for (Employee employee : headEmployee.subordinates) {

				System.out.println(employee);
			}
		}
	}
}
