package com.javabasics.typesofobjcreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private String sname;
	private String cname;

	public Student(String sname, String cname) {
		super();
		this.sname = sname;
		this.cname = cname;
	}

	public Student() {
		super();
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}

public class UsingDeserialisation {

	public static void main(String[] args) {
		String fileName = "sample.txt";
		Student s1 = new Student("akash", "Jyothishmathi");
		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			// Deserialization
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s2 = (Student) ois.readObject();
			ois.close();
			System.out.println(s2.getCname());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
