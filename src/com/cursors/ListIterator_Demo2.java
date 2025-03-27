package com.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_Demo2 {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("Bheem");
		l.add("Arjun");
		l.add("Krishna");
		l.add("Ram");
		
		ListIterator ltr=l.listIterator();
		System.out.println("Forward-Direction");
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("Backward-Direction");  // if we want to perform backward direcion firstly must complete the forward
		while(ltr.hasPrevious()) {                 // after forward only control reach to end then backward will possible
			System.out.println(ltr.previous());
		}
		
				
	}

}
