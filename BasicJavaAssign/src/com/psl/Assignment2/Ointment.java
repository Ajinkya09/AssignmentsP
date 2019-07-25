package com.psl.Assignment2;

public class Ointment extends Medicine{

	public Ointment(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public void displayLable() {
		// TODO Auto-generated method stub
		System.out.println("Name of Company :"+name+ " Address :"+address);
		System.out.println("For external use only");
	}
}
