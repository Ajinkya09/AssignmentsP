package com.psl.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(102, "Zakash", 400000);
		Employee e2 = new Employee(103, "Aniket", 300000);
		Employee e3 = new Employee(104, "Prasad", 200000);
		Employee e4 = new Employee(102, "Zakash", 400000);
		
		
		Set<Employee> set = new HashSet<Employee>();

		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		System.out.println(e1 == e4);
		System.out.println(e1.equals(e4));
		System.out.println(e1.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(set);
	}
} 
