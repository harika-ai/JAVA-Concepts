package com.javabasics.oops;

class StaticBnding {
	final void objecttype() {
		System.out.println("Type of obj is determined at compile time");
	}

}

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}
}

public class Binding {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Dog d1 = null;
		// instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface). 
		System.out.println(d1 instanceof Dog);
		System.out.println(a1 instanceof Animal);
		a1.eat();
		System.out.println(a1 instanceof Dog);
		StaticBnding sb = new StaticBnding();
		sb.objecttype();

	}

}
