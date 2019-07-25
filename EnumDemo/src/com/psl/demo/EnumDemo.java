package com.psl.demo;

public class EnumDemo {

	public static void main(String[] args) {
		System.out.println(Coffee.Small);
		System.out.println(Coffee.Large);

		Coffee c = Coffee.Large;
		
		String str = c.toString();
		System.out.println(str);
		
		for (Coffee c1 : Coffee.values()) {
			System.out.println(c1);
		}
		
		System.out.println(Coffee.Medium + " " + Coffee.Medium.getPrice());
	}
}
