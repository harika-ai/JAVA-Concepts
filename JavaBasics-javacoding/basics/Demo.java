package com.javabasics.basics;

public class Demo {
	int i = 10;
	float k = 1;
	static int l = 25;
	static double j = 5.2;

	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.i);
		System.out.println(obj.k);
		System.out.println(l);
		System.out.println(j);
		mult(20,30);
		obj.add((int) j, l);
	}
	public void add(int x, int y) {
		int res = x + y ;
		System.out.println(res);
		
	}
	public static void mult(int m , int n) //method signature // lines 24-27 method implementation
	{
		int res1 = m * n;
		System.out.println(res1);
	}

}
