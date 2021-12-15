package com.javabasics.oops;

class A {
	public A get() {
		return this;
	}
}

class B1 extends A {
	@Override
	public B1 get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

}

public class CovariantReturnType {

	public static void main(String[] args) {
		B1 b = new B1();
		System.out.println(b.get());
		b.message();
		new B1().get().message();
	}

}
