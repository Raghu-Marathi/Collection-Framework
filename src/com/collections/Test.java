package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(45);
		al.add(4);
		al.add(8);
		al.add(22);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("After sort"+ al);
		
		Collections.reverse(al);
		System.out.println("After reverse "+al);
	}
	
	// Collections is a available in java.util
	//it provides several static methods

}
