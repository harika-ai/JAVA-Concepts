package com.javabasics.basics;

class A1 {
	int x;

	public A1(int x) {
		this.x = x;
	}

}

class B1 extends A1 {
	boolean y;

	public B1(int x, boolean y) {
		super(x);
		this.y = y;
	}

}

public class SingleInheritance1 {

	public static void main(String args[]) {
		B1 b = new B1(4, true);
		System.out.println(b.y);
		System.out.println(b.x);
	}

}
