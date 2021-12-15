package com.javabasics.string;

public class ImmutableClass2 {

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass(50);
		System.out.println(ic.modify(50));
		System.out.println(ic.modify(5));

	}

}
