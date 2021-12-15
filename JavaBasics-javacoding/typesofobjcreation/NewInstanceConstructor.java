package com.javabasics.typesofobjcreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceConstructor {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, ExceptionInInitializerError {
		Constructor<Human2> constructor;
		try {
			constructor = Human2.class.getConstructor();
			Human2 h2 = constructor.newInstance("suresh", 'M', 35);
			System.out.println(h2.getAge());
			System.out.println(h2.getGender());
			System.out.println(h2.getName());
		} catch (Exception no) {

			no.printStackTrace();
		}

	}

}
