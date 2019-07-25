package com.psl.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSortDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee(102, "Zakash", 400000);
		Employee e2 = new Employee(103, "Aniket", 300000);
		Employee e3 = new Employee(104, "Prasad", 200000);
		List<Employee> list = new ArrayList<Employee>();

		// Set<Employee> list = new TreeSet<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		/*
		 * list.add("Aniket"); list.add("Akash"); list.add("Aniket");
		 * list.add("Akash");
		 */
		System.out.println("List Before Sort : " + list);

		Collections.sort(list);

		System.out.println("List After Sort :" + list);

		Collections.sort(list, new SortBySalary());

		System.out.println("Sorted by salary :" + list);
		
		Collections.sort(list, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.name.compareTo(e2.name);
			}
		});
		
		System.out.println("Sort by name :" + list);
	}
}
