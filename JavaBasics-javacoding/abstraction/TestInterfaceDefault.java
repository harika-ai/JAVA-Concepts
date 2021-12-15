package com.javabasics.abstraction;
interface Variable{
	public static int a =3;
	
}
interface Drawable {
public void draw();

	default void msg() {
		System.out.println("default method");
	}
}

interface Readable {
	default void msg() {
		System.out.println("Default method22");
	}

	default void read() {
		System.out.println("reading");
	}
}
// Multiple inheritance is possible with default methods also.F

class Rectangle implements Drawable, Readable {
	public void shape() {
		System.out.println("drawing shape of rectangle");
	}

	public void msg() {
		// Drawable.super.msg();
		Readable.super.msg();
	}

	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class TestInterfaceDefault {

	public static void main(String[] args) {
		// Upcasting
		Drawable d = new Rectangle();
		Rectangle r = new Rectangle();
		Readable read = new Rectangle();
		read.read();
		r.msg();
		r.read();
		d.draw();
		d.msg();
		r.shape();
	}

}
