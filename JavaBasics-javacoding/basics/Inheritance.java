package com.javabasics.basics;

class Employer {
	float salary = 40000;
}

public class Inheritance extends Employer {
	int bonus = 10000;

	public static void main(String args[]) {
		Inheritance p = new Inheritance();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}
