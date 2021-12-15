package com.javabasics.oops;

class Parent {
	String name;

	// A method which prints the
	// signature of the parent class
	void method() {
		System.out.println("Method from Parent");
	}
}

class Child extends Parent {
	int id;

	// Overriding the parent method
	// to print the signature of the
	// child class
	@Override
	void method() {
		System.out.println("Method from Child");
	}
}

class Child2 {

}

public class DownAndUpcasting {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		// Upcasting
		Parent p = new Child();

		// Downcasting
		Child c = (Child) p;
		// Child c2 = (Child2)p; --- since parent class and child2 class doesnt have any
		// relation so downcasting is not possible.
		// For doing downcasting, upcasting is compulsory.
		//If we do typecasting without upcasting by using parent object we get run time exception i.e, classcast exception.i.e,
		//Parent c2 = (Child)p1 ;
	}

}
