package com.practice_set;

import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(42);
		ls.add(null);  // here insertion order is preserved
		ls.add(77);    // remaing all same as hashset
		ls.add(42);
		ls.add(26);
		
		System.out.println(ls);
		
	}

}
