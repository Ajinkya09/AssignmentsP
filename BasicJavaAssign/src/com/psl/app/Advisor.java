package com.psl.app;

public class Advisor {
	String[] message;// = new String[]{"Never say never", ""};
	
	public Advisor() {
		// TODO Auto-generated constructor stub
		message = new String[]{"Never say never","Just do it"};
	}
	
	public String getAdvice() {
		// TODO Auto-generated method stub
		int i= (int) (Math.random()*5+1);
		
		return message[i];
	}
}
