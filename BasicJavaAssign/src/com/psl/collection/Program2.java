package com.psl.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		Map<String, String> products = new Hashtable<String, String>();

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter details of product :- ");
			products.put(sc.next(), sc.next());
		}

		Set<String> str = products.keySet();

		for (String string : str) {
			System.out.print("Product Id : " + string + " ");
			System.out.println("Product Name : " + products.get(string) + " ");
		}

		System.out.println("Enter the product id you want to search");
		String strS = sc.next();
		if (products.containsKey(strS)) {
			System.out.println("Product is present in list :");
			System.out.println("Product id : " + strS + " Product name : "
					+ products.get(strS));
		} else
			System.out.println("Product not found..");

		System.out.println("Enter product id to be removed :");
		String strR = sc.next();
		if (products.containsKey(strR)) {
			products.remove(strR);
			System.out.println("Product removed...!");
		} else
			System.out.println("Product not present");

		str = products.keySet();
		System.out.println("Updated list :");
		for (String string : str) {
			System.out.print("Product Id : " + string + " ");
			System.out.println("Product Name : " + products.get(string) + " ");
		}

		sc.close();
		System.exit(0);
	}
}