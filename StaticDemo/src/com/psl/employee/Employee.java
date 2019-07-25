package com.psl.employee;

public class Employee {
	private static int employeeId;
	private int employeeSalary;
	private String employeeName;
	
	public Employee(int salary,String name)
	{
		System.out.println("Constructor");
		employeeId++;
		employeeName = name;
		employeeSalary = salary;
	}
	{
		System.out.println("Instance block");
	}
	static{
		System.out.println("Static block 1");
	}
	static{
		System.out.println("Static block 2");
	}
	private void displayEmployee() {
		System.out.println("Method");
		// TODO Auto-generated method stub
		System.out.println("Employee is: "+employeeId + employeeName + employeeSalary);
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		Employee e1 = new Employee(10000, "BatMan");
		e1.displayEmployee();
		Employee e2 = new Employee(20000, "IronMan");
		e2.displayEmployee();
		Employee e3 = new Employee(80000, "SuperMan");
		e3.displayEmployee();
		
		System.out.println(Employee.employeeId);
	}
}
