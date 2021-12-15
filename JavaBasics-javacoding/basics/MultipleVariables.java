package com.javabasics.basics;

public class MultipleVariables {
	static int i = 50;

	public static void meth1() {
	   	i = 30;
	}

	public void meth2() {

		System.out.println(i);
	}

	public static void main(String[] args) {
		/*
		  static method static variable nsm mm reinitialise sv inside sm print sv
		  inside nsm call static method and non static method from main mm
		 */
		meth1();
		System.out.println(i);
		MultipleVariables var = new MultipleVariables();
		var.meth2();

	}

}
