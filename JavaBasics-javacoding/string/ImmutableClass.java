package com.javabasics.string;

public class ImmutableClass {

	private int i;

	public ImmutableClass(int i) {
		this.i = i;

	}

	@Override
	public String toString() {
		return "ImmutableClass [i=" + i + "]";
	}

	public ImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new ImmutableClass(i);
		}
	}

}
//Note: Immutable class wont change the content of existing object. If we need to reuse that existing object with the same content then we use the immutable class
//If the content is changed by passing the literals then immutable class creates new object. 