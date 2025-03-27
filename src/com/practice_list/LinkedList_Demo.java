package com.practice_list;

import java.util.LinkedList;

public class LinkedList_Demo {
	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		
		l.add("java");
		l.add("Python");
		l.add("AWS");
		l.add("Oracle");
		
		System.out.println(l);
		
		l.add(2,"Devops");
		System.out.println(l);
		
		l.addFirst("SpringBoot");
		l.addLast("C Lang");
		l.add("AI");
		System.out.println(l);
		
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		
	}

}
