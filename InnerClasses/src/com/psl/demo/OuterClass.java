package com.psl.demo;

interface MyInterface{
	public void myMethod();
}

public class OuterClass {

	private static int a = 10;

	private void displayOuter() {
		// TODO Auto-generated method stub
		System.out.println("Display OuterClass");

		class InnerClass {
			// int a = 20;

			void display() {
				System.out.println("Display InnerClass" + a);
			}
		}
		InnerClass in = new InnerClass();
		in.display();
	}

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.displayOuter();
		/*
		 * OuterClass.InnerClass obj1 = obj.new InnerClass(); obj1.display();
		 */
		/*
		 * OuterClass.InnerClass obj1 = new OuterClass.InnerClass();
		 * obj1.display();
		 */

		Parent p = new Parent() {
			
			@Override
			void myMethod(){
				System.out.println("New MyMethod");
			}
		};
		p.myMethod();
		
		MyInterface my = new MyInterface() {

			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
			System.out.println("MyMethod Implemented");	
			}
		};
		my.myMethod();
	}
}
