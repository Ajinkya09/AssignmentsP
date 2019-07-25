package com.psl.employee;

public class Developer extends Employee {

	int PF = 5000, TA = 10000, HRA = 15000;

	public Developer(int id, String name, int salary, int pf, int ta, int hra) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
		PF = pf;
		TA = ta;
		HRA = hra;
	}

	void myMethodDeveloper() {
		// TODO Auto-generated method stub
		System.out.println("Developer");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		int netSalary = salary + PF + TA + HRA;

		super.display();
		System.out.println("Developer :" + id + name + netSalary);

	}
}
