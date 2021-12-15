package com.javabasics.basics;

public class Area3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("main starts");
		Circular3 cir = new Circular3();
		Rectangular3 rec = new Rectangular3();
		cir.areaofcircle();
		rec.areaRect();
		Circular3 cir1 = new Circular3(5);
		Rectangular3 rec1 = new Rectangular3(3,4);
		cir1.areaofcircle();
		rec1.areaRect();
		Circular3 cir2 = new Circular3(5);
		Rectangular3 rec2 = new Rectangular3(3,4,5);
		cir2.areaofcircle();
		rec2.areaRect();

	}

}
