package com.javabasics.string;

public class ConstructorsMethodsOfsb {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append('q');
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer(4);
		sb1.append("abcdefghijklmnopqr");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		String s1 = "sumanth";
		StringBuffer s = new StringBuffer(s1);
		System.out.println(s.capacity());
		//System.out.println(sb.charAt(30));
		sb.setCharAt(0,'k');
		System.out.println(sb);
		sb.append(s);
		System.out.println(sb);// append is used to add the given string,byte,int,long,float at the end of sbuff or sbuild object.
		sb.insert(4, 'd');
		System.out.println(sb);// insert method is used to insert string char,byte at given index.
		sb.delete(2,5); // deletes from begin to end-1
		System.out.println(sb);
		sb.deleteCharAt(1); // deletes at given index
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setLength(5); // if we want to compress the object's length 
		System.out.println(sb);
		sb.ensureCapacity(3);
		System.out.println(sb);
		sb.append('c');
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		

	}

}
