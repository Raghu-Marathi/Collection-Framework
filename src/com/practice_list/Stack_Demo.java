package com.practice_list;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push("Raghu");
		s.push("Hari");
		s.push(24);
		s.push(99.99);
		
		System.out.println(s);
		s.pop();        // stack follows LIFO , pop means removing 
		System.out.println(s);
		System.out.println(s.search(24));         // it starts from 1 at top to bottom
		System.out.println(s.search("Raghu"));
		System.out.println(s.search("Murali"));   // if data not available it returns -1
		System.out.println(s.peek());    // returns top element
		System.out.println(s.empty());
		
	}

}
