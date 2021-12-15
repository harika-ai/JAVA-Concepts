package com.javabasics.basics;



public class AreaUserLogic {

	public static void main(String[] args) {
		System.out.println("main starts");
		CircularBusinessLogic  cir = new CircularBusinessLogic();
		RectanglularBusinessLogic rec = new RectanglularBusinessLogic();
		cir.areaofcircle();
		rec.areaRect();

	}

}
