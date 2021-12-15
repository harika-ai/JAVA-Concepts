package com.javabasics.oops;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

//Creating child classes.  
class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

class Vehicle {
	public void run() {
		System.out.println("Vehicle is running");

	}
}

class Bike extends Vehicle {
	public void run() {
		System.out.println("Bike is running");
	}
	public void speed()
	{
		System.out.println("bike speed is fast");
	}
}

public class TestOverriding {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
		//upcasting i.e, method overriding
		Vehicle v = new Bike();
		v.run();
		//v.speed(); -- with upcasting we can only use overrided method
		SBI s = new SBI();
		System.out.println(s.getRateOfInterest());

	}

}
