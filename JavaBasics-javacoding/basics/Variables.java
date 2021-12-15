package com.javabasics.basics;

public class Variables {

	static int i = 50;
	int b = 60;

	public static void met1() {
		i = 30;
		Variables v = new Variables();
		v.b = 40;
		System.out.println(i);
		System.out.println(v.b);
	}

	public void met2() {
		i = 20;
		Variables v = new Variables();
		v.b = 20;
		System.out.println(i);
		System.out.println(v.b);
	}

	public static void main(String[] args) {
		Variables var = new Variables();
		var.met2();
		met1();
		var.met2();
		System.out.println(i);
	}

}
