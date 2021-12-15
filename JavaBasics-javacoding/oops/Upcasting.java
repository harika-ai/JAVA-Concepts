package com.javabasics.oops;

class Bike3 {
	public void run() {
		System.out.println("running");

	}
}

class Splender extends Bike3 {
	public void run() {
		System.out.println("Splender running");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		Bike3 b3 = new Splender();
		// Upcasting: we are calling run method by the ref variable of parent class.
		// since it refers to subclass object and subclass method overrides the parent
		// class method the subclass method is invoked at runtime.
		// since method invocation is determined by JVM not compiler, it is runtime polymorphism.
		b3.run();
	}

}
