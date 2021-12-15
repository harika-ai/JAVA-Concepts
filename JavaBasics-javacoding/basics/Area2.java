package com.javabasics.basics;

// In level 1 programming by declaring and intialising the nsv the value of variable is not changing frm one obj to another obj.
// So its working but we are not using proper way because of nsv property(nsv -- multiple copies having diff values)
public class Area2 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Circular2 cir = new Circular2();
		Rectangular2 rec = new Rectangular2();
		cir.rad = 6;
		rec.length = 4;
		rec.breadth = 5;
		cir.areaofcircle();
		rec.areaRect();

	}

}
// Drawback of this level2 : there may be a chance of forgetting to initialise the nsv after the creation of an obj.
//Then it takes the default values which are given by compiler because of this the depending method will not work properly for giving the results.
