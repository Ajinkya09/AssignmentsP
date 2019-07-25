package com.psl.demo;

public class AgeInvalidException extends Exception {
	public AgeInvalidException(String str) {
		// TODO Auto-generated constructor stub
		System.out.println(str);
	}

	public void invalidAge() {
		// TODO Auto-generated method stub
		System.out.println("Age must be greater than 18..!!");
	}
}
