package com.psl.demo;

public class ExceptionDemo {

	private void display() {
		// TODO Auto-generated method stub

		System.out.println("Display...!!");
	}

	public static void main(String[] args) {

		/*
		 * try { FileOutputStream fos = new FileOutputStream(""); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		int result = 0, a = 10, b = 0;
		ExceptionDemo obj = null;

		try {
			obj.display();

			result = a / b;

			System.out.println("Result is :" + result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			// e.printStackTrace();

			System.out.println("Hey!! You cannot divide by zero");

			b = 2;

			result = a / b;

			System.out.println("Very good :-" + result);
		} catch (NullPointerException e) {
			// TODO: handle exception

			obj = new ExceptionDemo();
			obj.display();

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Try Again ..!!");
		} finally {
			System.out.println("I will always execute...!!!");
		}

		System.out.println("All is well!!!");
	}
}
