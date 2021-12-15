package com.javabasics.basics;

public class ConstructorOverloadingClass {

	public static void main(String[] args) {
		// Call empty constructor
				Employee e1 = new Employee();
				e1.display();

				// Call one parameter constructor
				Employee e2 = new Employee(123);
				e2.display();

				// Call two parameter constructor
				Employee e3 = new Employee(123, "John");
				e3.display();

	}

}
