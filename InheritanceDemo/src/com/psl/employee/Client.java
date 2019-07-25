package com.psl.employee;

public class Client {
	
	private static void add(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
		System.out.println(sum);
	}
	
	private static void add(int a, int b, int c) {
		// TODO Auto-generated method stub
		int sum=a+b+c;
		System.out.println(sum);
	}
	
	private static void add(int... a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
	
	private static void display(Employee obj) {
		// TODO Auto-generated method stub
		Developer d1 = (Developer) obj;
		
		d1.myMethodDeveloper();
	}
	
	public static void main(String[] args) {

		//Employee e = new Employee(101, "Bond", 777);
		// e.displayEmployee();
		// no need to call constructor of base class

		Developer d = new Developer(101, "Bond", 777, 1000, 2000, 3000); // dynamic
		d.display();													// method
																		// dispatch(DMD)

		// //d.displayEmployee();
		
		//d.myMethodDeveloper();
		d.myMethodEmployee();
		
		display(d);
		
		add(10);
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}
}