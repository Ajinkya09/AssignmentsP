package com.psl.demo;

public class Employee implements Comparable<Employee> {
	int id, salary;
	String name;

	public Employee(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		
		if(this.id == e.id && this.name == e.name && this.salary == e.salary)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return id*31;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee :" + id + " " + name + " " + salary;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub

		int i = 0;

		if (this.id > e.id) {
			i = 1;
		} else if (this.id < e.id) {
			i = -1;
		} else {
			i = 0;
		}
		return i;
	}
}