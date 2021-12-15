package com.javabasics.typesofobjcreation;

public class Human2 {
	private String name;
	private char gender;
	private int age;
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
	public Human2(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	



}
