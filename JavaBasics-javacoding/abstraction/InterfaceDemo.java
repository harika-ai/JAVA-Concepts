package com.javabasics.abstraction;

interface Showable {
	void show();

	void print();
}
//multiple inheritance is possible through interface
public class InterfaceDemo implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.print();
		obj.show();

	}

}
