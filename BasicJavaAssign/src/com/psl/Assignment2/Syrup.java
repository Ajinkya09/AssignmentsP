package com.psl.Assignment2;

public class Syrup extends Medicine{

	public Syrup(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public void displayLable() {
		// TODO Auto-generated method stub
		System.out.println("Name of Company :"+name+ " Address :"+address);
		System.out.println("Do not exede dosage");
	}
}
