package com.javabasics.basics;

public class MultipleObjects {
 static int i = 50;
 int j = 30 ;
	public static void main(String[] args) {
		MultipleObjects obj1 = new MultipleObjects();
		MultipleObjects obj2 = new MultipleObjects();
		MultipleObjects obj3 = new MultipleObjects();
		System.out.println(obj1.j);
		System.out.println(i);
		System.out.println(obj2.j);
		System.out.println(obj3.j);
		
		

	}

}
