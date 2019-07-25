package com.psl.demo;

//class: to display a date in mm/dd/yyyy format
//@author: Ajinkya Shimpi
 class DateDemo {
	private int date, month, year; // to store date, month and year

	public DateDemo() {
		// TODO Auto-generated constructor stub
		this(7,7,2007);
		date =10;
	}
	
	public DateDemo(int date, int month, int year) {
		// TODO Auto-generated constructor stub
//		this();
//		this.date = date;
		this.month = month;
		this.year = year;
	}
	

//	private void initdate() {
//		// TODO Auto-generated method stub
//		date = 11;
//		month = 7;
//		year = 2019;
//	}

	private void displayDate() {
		// TODO Auto-generated method stub
		System.out.println("Today's date is : " + month + "/" + date + "/"+ year);
	}

	public static void main(String[] args) 
	{
		DateDemo obj = new DateDemo();	//object creation
		
//		obj.initdate();
		obj.displayDate();
	}
}