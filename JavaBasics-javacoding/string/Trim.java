package com.javabasics.string;

public class Trim {

	public static void main(String[] args) {
		String s = "     ";
		s.trim();
		System.out.println(s.equals("") + "   " + s.isEmpty());
		String s1 = "durga soft";
		int length = s1.trim().length();
		System.out.println(length);
		String s2 = "hello lawyer";
		s2.trim();
		System.out.println(s2.indexOf(' '));
		
		
		
	}

}
