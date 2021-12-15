package com.javabasics.basics;

public class Rectangular3 {
	int length;
	int breadth;
	int width;

	public void areaRect() {
		int areaOfRect = this.length * this.breadth * this.width;
		System.out.println(areaOfRect);
	}

	public Rectangular3() {

		// Default constructor

	}

	public Rectangular3(int length, int breadth) {

		this.length = length;
		this.breadth = breadth;
	}

	public Rectangular3(int length, int breadth, int width) {
		this(length, breadth); // call to this statement
		this.width = width;
	}

}
