package com.psl.files;

public class Program4 {

	public String[] getTokens(String data) {
		// Write a code here to tokenize the words in the given String and
		// return an array of words
		String[] tokens = data.split(" ");

		return tokens;
	}

	public String reverseAndAppend(String[] data) {
		// Write a code here to reverse and append the words in the passed array
		int i = 0, j, k;
		char temp;
		StringBuilder sb = new StringBuilder();

		while (i < data.length) {
			char[] tempArray = data[i].toCharArray();

			j = 0;
			k = tempArray.length - 1;

			while (j < k) {
				temp = tempArray[j];
				tempArray[j] = tempArray[k];
				tempArray[k] = temp;

				j++;
				k--;
			}
			sb.append(String.valueOf(tempArray)).append(" ");

			i++;
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// Check your code by calling methods from here
		Program4 client = new Program4();

		String[] tokens = client.getTokens("To be or not to be");

		String reversed = client.reverseAndAppend(tokens);
		System.out.println(reversed);
	}
}
