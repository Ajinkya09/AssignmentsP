package com.psl.Assignment2;

public class TestMedicine {
	public static void main(String[] args) {
		Medicine[] m = new Medicine[10];
		
		m[1] = new Tablet("Cheston Cold", "Bhopal");
		m[2] = new Syrup("Stodal","Mumbai");
		m[3] = new Ointment("Moov","Delhi");
		
		int i = (int)(Math.random() * 3 + 1);
		m[i].displayLable();
	}
}
