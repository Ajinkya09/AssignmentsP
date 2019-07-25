package com.psl.shape;

public class Circle extends Shape {
	
	float pi=3.14f;
	int r;
	
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
	
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		float area= pi * r * r;
		
		System.out.println("Area of circle is :"+area);
	}
}
