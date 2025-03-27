package com.practice_list;

import java.util.ArrayList;

public class Collection_Demo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(65);
		al.add(23);
		al.add(88);
		al.add(41);
		
		System.out.println(al);
		//al.remove(41);   // error bcoz it is checking 41th index not 41 value
		//al.remove((Integer)41);   // it work but not recommended
		al.remove(3);    // given index
		                // if we perform remove() operation on integers better to go based on index ,not obj data
		System.out.println(al);
				
		ArrayList al2=new ArrayList();
		al2.add("Arjun");
		al2.add("Bheem");
		al2.add("Raghu");
		System.out.println(al2);
		
		al2.remove("Bheem"); 
		System.out.println(al2);
		
		al2.addAll(al);
		System.out.println(al2);
		
		al2.removeAll(al);
		System.out.println(al2);
		
//		al2.retainAll(al);  // means storing only al data ,remaining data will remove
//		System.out.println(al2);
		
		al2.clear();          // total data will remove
		System.out.println(al2);
		
	}

}
