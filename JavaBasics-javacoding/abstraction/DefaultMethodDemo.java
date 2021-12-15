package com.javabasics.abstraction;

interface Defaulted {
	default void kick() {
		System.out.println("Default method in interface");
	}
}
abstract class Defined
{
	void assume()
	{
		System.out.println("Defined method in abstract class");
	}
}

class Interface implements Defaulted
{
	public void kick()
	{
		Defaulted.super.kick();				
	}
}

public class DefaultMethodDemo extends Defined{

	void assume()
	{
		System.out.println("in assume");		
	}
	public static void main(String[] args) {

	}

}
