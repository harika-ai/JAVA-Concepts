package com.javabasics.typesofobjcreation;

import com.javabasics.oops.*;

public class newInstanceClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		// com.javabasics.oops
		String packageName = "com.javabasics.oops.Employee2";
		Class classObj = null;
		try {
			classObj = Class.forName(packageName);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// Note:
		// forName: It is a static method used for loading class from fully qualified
		// PackageName
		Employee2 object = (Employee2) classObj.newInstance();
		object.setEmpage(30);
		object.setEmpid(1734);
		object.setEmpName("ramesh");
		object.setSalary(35000);
		System.out.println(object.getEmpage());
		System.out.println(object.getSalary());
		System.out.println(object.getEmpid());
		System.out.println(object.getEmpName());

	}

}
