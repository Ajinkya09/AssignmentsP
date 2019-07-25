package com.psl.langFund;

import java.util.Scanner;

public class Problem2 {

	private static int[] nos = { 1, 3, 5, 7, 9, 0, 2, 4, 6, 8, 10 };
	private static int num;

	private static int findPosition(int num, int[] nos) {
		// TODO Auto-generated method stub
		for (int i = 0; i < nos.length; i++) {
			if (num == nos[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Enter number you want to search");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		int pos = findPosition(num, nos);
		if (pos == -1) {
			System.out.println("Number not present in the list");
		} else {
			System.out.println("Number is present at position :" + (pos + 1));
		}
		sc.close();
	}
}
