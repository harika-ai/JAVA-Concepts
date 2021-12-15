package com.javabasics.basics;

public class Employee {
	int id;
	String name;
	int Empid;

	// Empty constructor
	public Employee() {
		this.id = 0;
		this.name = "Not Available";
	}

	// Overloaded constructor with int parameter
	public Employee(int id) {
		this.id = id;
		this.name = "Not Available";

	}

	// Overloaded constructor with a int parameter and a string
	public Employee(int id, String name) {
		this(id); // constructor chaining
		this.name = name;
	}

	public void display() {
		System.out.println("Employee Info: ");

		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
	}

}
