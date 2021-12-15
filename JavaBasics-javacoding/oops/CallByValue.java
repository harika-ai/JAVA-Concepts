package com.javabasics.oops;

public class CallByValue {
	Integer data = 50;

	void change(Integer data) {
		data = data + 100; // change will be in the local variable only
	}

	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		System.out.println("Before change " + cbv.data);
		cbv.change(100);
		System.out.println("After change " + cbv.data);

	}

}
