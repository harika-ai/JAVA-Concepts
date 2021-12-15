package com.javabasics.basics;

class Operation {
	public int square(int n) {
		return n * n;
	}
}

public class AggregationCircle {

	Operation op;// aggregation
	double PI = 3.14;

	public double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius);// code reusability (i.e. delegates the method call).
		return PI * rsquare;
	}

	public static void main(String[] args) {
		AggregationCircle acr = new AggregationCircle();
		System.out.println(acr.area(5));

	}

}
