package com.javabasics.oops;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 20;
		Integer b = Integer.valueOf(a); // autoboxing done explicitly by developer int to Integer
		Integer b1 = a; // Now compile will write default value of method.
		System.out.println(b);
		System.out.println(b1);
		//UNBOXING
		Integer i = new Integer(3);
		int i1 = i.intValue(); // calling explicitly
		System.out.println(i1);
		int i2 = i; // By default by compiler from Integer to int
		System.out.println(i2);

	}

}
