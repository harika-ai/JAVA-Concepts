package com.javabasics.typesofobjcreation;

class Human {
	String name;
	char gender;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Human(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class UsingNew {

	public static void main(String[] args) {
		Human h = new Human();
		h.setName("Sumanth");
		h.setGender('M');
		h.setAge(24);
		System.out.println(h.getAge());
		System.out.println(h.getGender());
		System.out.println(h.getName());

	}

}
