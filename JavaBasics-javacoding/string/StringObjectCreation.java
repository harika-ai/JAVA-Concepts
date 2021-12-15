package com.javabasics.string;

public class StringObjectCreation {

	public static void main(String[] args) {

		String s1 = new String("durga");
		String s2 = new String("durga");
		String s3 = "durga";
		String s4 = "durga";

		System.out.println((s1 == s2));
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		String st = new String("durga");
		st.concat("software");
		String st1 = st.concat("software");
		// whenever obj is created in heap memory reference is pointing heap memory obj
		// only eventhough one more obj is created in scp by literal.
		// After concat of string objects resultant string object
		// going to store in heap area if we are not assigning any reference then it is
		// going to be destroyed by garbage collector, else it wont
		//Note: scp is used for storing literals(content).

	}

}
