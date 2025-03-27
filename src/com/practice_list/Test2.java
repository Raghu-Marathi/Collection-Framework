package com.practice_list;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>(); //it can store only Strings
		
		al.add("Java");
		al.add("SpringBoot");
		al.add("HTML");
		al.add("Python");
		al.add("java");
		al.add(null);
		
		System.out.println(al);
		
//		for(String k:al) {
//			System.out.println(k);
//		}
	
	}

}
