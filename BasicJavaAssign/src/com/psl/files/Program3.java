package com.psl.files;

public class Program3 {

	public static int check(String sentence, String word) {
		int counter = 0;

		String arr[] = sentence.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(word)) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		String input = "Hello my name is Ajinkya , Ajinkya is from jalgaon";
		String search = "Ajinkya";
		int count = check(input, search);
		System.out.println("count of word to search : " + count);
	}
}
