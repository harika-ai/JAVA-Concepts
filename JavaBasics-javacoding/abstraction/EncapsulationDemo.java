package com.javabasics.abstraction;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentId(3);
		s1.setStudentName("Harika");
		s1.setCollegeName("jyothishmathi");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getCollegeName());
		System.out.println(s1.getStudentName());
	}

}
