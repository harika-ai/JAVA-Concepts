package com.javabasics.string;

public class StringObjectCreation22 {

	public static void main(String[] args) {
		String s1 = new String("you cannot");
		String s2 = new String("you cannot");
		System.out.println(s1 == s2);
		String s3 = "you cannot";
		System.out.println(s3 == s1);
		String s4 = "you cannot";
		System.out.println(s3 == s4);
		String s5 = "you " + "cannot";
		System.out.println(s4 == s5);
		String s6 = "you ";
		String s7 = s6 + "cannot";
		System.out.println(s6 == s7);
		System.out.println(s7 == s5);
		final String s8 = "you ";
		System.out.println(s8);
		String s9 = s8 + "cannot";
		// s8 = "cannot";
		String s10 = s8;
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s8 == s9);
		System.out.println(s8 == s6);
		String scp = "scp";
		String scp1 = "scp";

	}

}
