package com.psl.demo;

public class StringDemo {
public static void main(String[] args) {
	String str1 = "Ajinkya";
	String str2 = "Ajinkya";
	
	String str3 = new String("Ajinkya");
	String str4 = new String("Ajinkya");
	
	System.out.println(str1 == str2);
	
	System.out.println(str1 == str3);
	
	System.out.println(str1.equals(str2));
	
	System.out.println(str1.equals(str4));
	
	String str = str1.concat(" Shimpi");
	System.out.println(str);

}
}
