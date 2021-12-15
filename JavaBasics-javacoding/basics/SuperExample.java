package com.javabasics.basics;

class Super1 {
	String st = "Super1 class";

	public String sitsame() {
		return st;
	}
}

class Super2 extends Super1 {
	String st = "Super2 class";

	public String sitsame() {
		System.out.println(st);
		System.out.println(super.st);
		System.out.println(super.sitsame());
		return st;
	}
}

public class SuperExample {

	public static void main(String[] args) {
		Super2 s2 = new Super2();
		s2.sitsame();

	}

}
