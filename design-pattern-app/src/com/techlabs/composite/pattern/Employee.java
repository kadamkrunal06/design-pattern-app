package com.techlabs.composite.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	public List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	public void addEmployee(Employee employee) {
		subordinates.add(employee);
	}

	@SuppressWarnings("unchecked")
	public Iterator<Employee> getSubordinates() {
		return (Iterator<Employee>) subordinates;
	}

	public String toString() {
		return ("Name = " + name + "Department = " + dept + "Salary = " + salary);
	}

}
