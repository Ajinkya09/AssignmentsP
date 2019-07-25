package com.psl.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		List<String> studentName = new ArrayList<String>();
		//boolean flag = false;

		studentName.add("Ajinkya");
		studentName.add("Prasad");
		studentName.add("Akmal");
		studentName.add("Pankaj");
		studentName.add("Aniket");
		studentName.add("Akash");

		System.out.println(studentName);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name you want to search :");
		String search = sc.next();

		// for (String str : studentName) {
		// if (str.equals(search)) {
		// System.out.println("Student name found in list");
		// flag = true;
		// break;
		// }
		// }
		// if (flag == false) {
		// System.out.println("Student name not found in list");
		// }

		if (studentName.contains(search)) {
			System.out.println("Student name found in list");
		} else
			System.out.println("Student name not found in list");

		sc.close();
	}
}