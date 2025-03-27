package com.practice_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Demo2 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(14);
		al.add(32);
		al.add(27);
		al.add(95);
		
		System.out.println(al);
		
		LinkedList l=new LinkedList(al);  // arraylist converting into linkedlist
		
		System.out.println(l);
		
		
	}

}
