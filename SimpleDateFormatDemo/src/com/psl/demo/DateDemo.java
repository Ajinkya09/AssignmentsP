package com.psl.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String str = sdf.format(d);
		System.out.println(str);
		
		String str1 = "12/7/2007";
		
//		sdf.setLenient(false);
		System.out.println(d.getTime());
		Date d1 = null;
		try {
			d1 = sdf.parse(str1);
			
			System.out.println(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(d1);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.set(Calendar.DAY_OF_MONTH, 21);
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 15);
		System.out.println(c.getTime());
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		
		java.sql.Date d2 = new java.sql.Date(d1.getTime());
		System.out.println(d2);
		
		Date d3 = new Date(d2.getTime());
		System.out.println(d3);
	}
}
