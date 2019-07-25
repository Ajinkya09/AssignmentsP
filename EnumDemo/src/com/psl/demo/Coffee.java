package com.psl.demo;

public enum Coffee {
	Small(50), Medium(100), Large(150);

	int p=1000;

	private Coffee(int p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return p;
	}
}