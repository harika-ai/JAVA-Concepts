package com.javabasics.youtube;

class Subraction {
	int num1;
	int num2;
	int res;

	public void Action()
	{
		res = num1 - num2;
	}
}

public class Class {

	public static void main(String[] args) {
		Subraction obj = new Subraction();
		obj.num1 = 20;
		obj.num2 = 10;
		obj.Action();
		System.out.println(obj.res);
	}

}
