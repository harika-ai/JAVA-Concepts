package com.javabasics.oops;

public class CallByReference {

	Integer data = 50;

	//void change(Integer CallByReference cbr) {
	//	data = data + 100; // change will be in the local variable only
	//}

	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		System.out.println("Before change " + cbr.data);
	//	cbv.change(100);
		System.out.println("After change " + cbr.data);

	}
}
