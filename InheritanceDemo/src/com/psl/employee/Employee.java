package com.psl.employee;

public class Employee {
	int id = 10, salary = 10000;
	String name = "Bond";

	public Employee(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void myMethodEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee");
	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee :" + id + name + salary);
	}
}
