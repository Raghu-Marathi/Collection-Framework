package com.practice_list;

import java.util.ArrayList;

public class Collection_Demo3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(65);
		al.add(23);
		al.add(88);
		al.add(41);
				
		System.out.println(al);
		
		ArrayList al3=new ArrayList();
		al3.add("Ram");
		al3.add("Bheem");
				
		ArrayList al2=new ArrayList();
		al2.add("Arjun");
		al2.add("Bheem");
		al2.add("Raghu");           //  default capacity=10   if we reach that, it will auto increment  
		al2.addAll(al);             //  new capacity = old capacity*3/2+1
		al2.addAll(al);                  
		System.out.println(al2);
		System.out.println(al2.size());  // size is no.of.elements
		
		System.out.println(al2.contains("Raghu"));  // returns boolean value
		System.out.println(al2.containsAll(al3));
		
		System.out.println(al3.isEmpty());      // it will check obj empty or not ,if empty return true , else false
		
		Object[] arr=al2.toArray();    // collection converting to array,return type is Object array ,coz Arraylist may not contain same type of data
		System.out.println(arr);
	}

}
