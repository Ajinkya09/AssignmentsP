package com.psl.demo;

public class UserDefException {

	private void validateAge(int age) throws AgeInvalidException {
		// TODO Auto-generated method stub

		if (age < 18) {

			throw new AgeInvalidException("Invalid age Exception");
		}

	}

	public static void main(String[] args) {
		int age = 19;

		UserDefException obj = new UserDefException();

		try {
			obj.validateAge(age);

		} catch (AgeInvalidException e) {
			// TODO: handle exception
			e.invalidAge();
		}

		if (age < 18) {
			System.out.println("age less than 18");
		}

		assert (age < 18) : "Invalid Age Error";

		System.out.println("Go Ahead!!");
	}
}