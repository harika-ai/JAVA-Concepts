package com.javabasics.abstraction;

abstract class Vehicle {
	abstract void run();
	Vehicle()
	{
		
	}
	// static void cost();
	void speed() {
		System.out.println("In vehicle speed");
	}

}

class Bike extends Vehicle {
	void run() {
		System.out.println("In vehicle run");
	}

}

abstract class Car {
	static int speed;

	static void color() {
		System.out.println("red car");
	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		Vehicle v = new Bike();
		System.out.println(Car.speed);

	}

}
