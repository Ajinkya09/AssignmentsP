package com.psl.Assignment2;

public class Medicine {
	String name, address;
	
	public Medicine(String name, String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
	}
	
	public void displayLable() {
		// TODO Auto-generated method stub
		System.out.println("Name of Company :"+name+ " Address :"+address);
	}
}
