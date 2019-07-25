package com.psl.langFund;

import java.util.Scanner;

public class Problem1 {
	private static String[] productNames;
	private static String keyword;

	private static String[] initProductName() {
		// TODO Auto-generated method stub
		productNames = new String[] { "DELL", "LENOVO", "ASUS", "HP", "APPLE" };
		return productNames;
	}

	private static boolean isPresent(String[] productNames, String keyword) {
		// TODO Auto-generated method stub
		for (int i = 0; i < productNames.length; i++) {
			if (productNames[i].toLowerCase().equals(keyword.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		boolean check;
		initProductName();

		System.out.println("Enter keyword to search");
		Scanner sc = new Scanner(System.in);

		keyword = sc.nextLine();
		check = isPresent(productNames, keyword);

		if (check) {
			System.out.println("Product is present");
		} else
			System.out.println("Product is not available");
		
		sc.close();
	}
}
