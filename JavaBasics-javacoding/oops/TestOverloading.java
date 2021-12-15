package com.javabasics.oops;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, int b) {
		return a + b;
	}
	//static double add(int a, int b) {
		// Method overloading is not possible by changing the return type.
	//}
}

public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		Adder ad = new Adder();
		System.out.println(ad.add(5.2, 30));

	}

}
