package com.javabasics.youtube;

class Emp {
	int eid;
	int sal;
	static String ceo;

	public void Display() {
		System.out.println("salary of emp " + eid + " is " + sal + " "+ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Emp mahesh = new Emp();
		mahesh.eid = 10;
		mahesh.sal = 1000;
		mahesh.ceo = "rupa";
		
		Emp rahul = new Emp();
		rahul.eid = 11;
		rahul.sal = 5000;
		rahul.ceo = "papa";
		
		mahesh.Display();
		rahul.Display();
	}

}
