package com.javabasics.string;

public class StringCase1 {

	public static void main(String[] args) {
		String s = new String("durga");
		String st = new String("durga");
		StringBuffer st1 = new StringBuffer("durga");
		StringBuffer s1 = new StringBuffer("durga");
		s.concat("software");
		s1.append("software");
		System.out.println(s);
		System.out.println(s1);
		// Note: Object s is immutable ---> after concatenation another object will
		// create but it is not assigned it to any reference i.e, address in heap memory
		// because of this garbage collector remove the unreferenced objects thats why
		// string objects are immutable
		// Object s1 is mutable ---> after appending the object, the content is going to
		// be in previous object only. new object wont create
		System.out.println(s == st); // == always meant for references. If both references have same object then we
										// get true else it is false
		System.out.println(s1 == st1); // above mentioned condition is same for string buffer also
		System.out.println(s.equals(st)); // .equals --> it is a method of super class(i.e, object) used for reference
											// or address comparision in objects, so this method is overridden for content
											// comparision of objects in sub class i.e, in String class
		System.out.println(s1.equals(st1)); // string buffer is also sub class of Object class. In this .equals method
											// is not overridden so this method will compare reference of the objects.
	}

}
