package com.javabasics.basics;

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat1 extends Animal1 {
	void meow() {
		System.out.println("meowing...");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat1 c = new Cat1();
		c.meow();
		c.eat();
		Dog1 d = new Dog1() ;
		d.bark();
		d.eat();

	}

}
