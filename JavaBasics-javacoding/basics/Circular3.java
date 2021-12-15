package com.javabasics.basics;

public class Circular3 {
	int rad;

	final static double PI = 3.14;

	public void areaofcircle() {
		double area = (PI * rad * rad);
		System.out.println(area);

	}

	public Circular3() {
		super();
		// Default constructor
	}

	public Circular3(int rad) {
		super();
		this.rad = rad;
	}
}