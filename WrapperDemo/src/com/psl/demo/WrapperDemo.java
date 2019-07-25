package com.psl.demo;

public class WrapperDemo {
	public static void main(String[] args) {
		int i = 10;

		Integer i1 = new Integer(i);

		System.out.println(i);
		System.out.println(i1);

		String str = args[0];

		System.out.println(str + 10);
		int i2 = Integer.parseInt(str);
		System.out.println(i2 + 10);

		Integer i3 = i; // autoboxing jdk5
		int i4 = i1; // auto-unboxing
		
		String str1 = String.valueOf(i4);
		
		System.out.println(str1);
	}
}
