package com.practice_list;

import java.util.ArrayList;

public class Collection_Demo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(11);
		al.add(23);
		al.add(28);
		al.add(15);
		
		System.out.println(al);
		
		al.add(3, 56);   // adding 3rd index value 56
		al.add(49);       // adding at last
		System.out.println(al);
		
		
		ArrayList al2=new ArrayList();
		al2.add("Dhoni");
		al2.add("Sachin");
		al2.add("Virat");
		al2.add("Rohit");
		
		System.out.println(al2);
		
		al2.addAll(al);
		System.out.println(al2);
		
		al2.addAll(2, al);
		System.out.println(al2);
		
		Integer a=128;
		Integer b=128;
		System.out.println(a==b);

	}

}
