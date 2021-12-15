package com.javabasics.typesofobjcreation;

import java.lang.Cloneable;

class Vehicle implements Cloneable {
	private String vname;
	private int milage;

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public Vehicle(String vname, int milage) {
		super();
		this.vname = vname;
		this.milage = milage;
	}

	// Overriding clone() method
	// by simply calling Object class
	// clone() method.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class UsingCloneMethod {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("activa", 50);

		try {

			Vehicle v2 = (Vehicle) v1.clone();
			System.out.println(v2.getVname());
			System.out.println(v2.getMilage());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
