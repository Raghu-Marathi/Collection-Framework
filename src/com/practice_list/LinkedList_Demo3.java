package com.practice_list;

import java.util.LinkedList;

public class LinkedList_Demo3 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add(52);
		l.add("Ram");
		l.add(52);
		l.add(null);
		l.add("Laxman");
		
		System.out.println(l);
		l.add(0,"Hanman");
		l.addFirst(70);
		l.removeLast();
		System.out.println(l);

	}

}
