package com.javabasics.basics;

class Bike12 {
	int cube(final int n){  
//	  n=n+2;//can't be changed as n is final  
	   return n*n*n;  
	  }

	
}

public class FinalParameter {

	public static void main(String[] args) {
		Bike12 b = new Bike12();
		b.cube(5);
	}

}
