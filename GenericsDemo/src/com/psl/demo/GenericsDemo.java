package com.psl.demo;

public class GenericsDemo<T> {
	T obj;

	public GenericsDemo(T obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public static void main(String[] args) {

		GenericsDemo<String> obj1 = new GenericsDemo<String>(new String("Ajinkya"));

		GenericsDemo<Integer> obj2 = new GenericsDemo<Integer>(new Integer(10));

		String obj = obj1.getObj();
		System.out.println(obj);

		Integer str = obj2.getObj();
		System.out.println(str);
	}
}