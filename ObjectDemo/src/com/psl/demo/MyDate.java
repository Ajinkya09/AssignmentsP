package com.psl.demo;

public class MyDate {
private int date,month, year;

public MyDate(int date, int month, int year) {
	// TODO Auto-generated constructor stub
	
	this.date= date;
	this.month=month;
	this.year=year;
}

@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	
		MyDate m = (MyDate)obj;
		if(this.date == m.date && this.month == m.month && this.year == m.year)
		{
			return true;
		}
		else 
			return false;
	}

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return date+month+year;
	}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Today's date is : "+ month + "/" + date + "/" + year;
	}

public static void main(String[] args) {
	MyDate obj1 = new MyDate(15, 7, 2019);
	
	System.out.println(obj1);
	
	MyDate obj2 = new MyDate(15, 7, 2019);
	
	System.out.println(obj2);
	
	System.out.println(obj1 == obj2);
	System.out.println(obj1.equals(obj2));
	
	System.out.println(obj1.hashCode());
	System.out.println(obj2.hashCode());

}

}
