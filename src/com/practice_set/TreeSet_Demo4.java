package com.practice_set;

import java.util.TreeSet;

public class TreeSet_Demo4 {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator2());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("DD"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");      // duplicates not allowed
		
		System.out.println(t);
		
	}

}
