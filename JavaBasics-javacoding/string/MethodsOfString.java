package com.javabasics.string;

public class MethodsOfString {

	public static void main(String[] args) {
		String s = "durga";
		System.out.println(s.charAt(4));
		// System.out.println(s.charAt(30)); // we will get runtime exception-
		// java.lang.StringIndexOutOfBoundsException:
		// as index 30 is out of range
		s.concat("software");
		System.out.println(s); // Because of immutability
		s = s.concat("software");
		System.out.println(s); // assigning is possible for immutable objs
		String s1 = "durga";
		System.out.println(s.equals(s1));
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		int[] x = { 10, 20, 30, 40 };
		System.out.println(x.length);
		String s2 = "always";
		System.out.println(s2.length());
		System.out.println(s.replace('a', 'i'));
		System.out.println(s.substring(3)); // prints from 3rd index to end of string
		System.out.println(s.substring(3, 8)); // from beginining index to end-1 index
		System.out.println(s.indexOf('g'));
		System.out.println(s.indexOf('z'));
		String st1 = "babbab";
		System.out.println(st1.lastIndexOf('b'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String st2 = "   you cannot   ";
		System.out.println(st2.trim()); // by using trim we will eliminate the spaces before and after the string but not in middle
	}

}
