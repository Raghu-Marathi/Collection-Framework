package com.practice_set;

import java.util.TreeSet;

public class TreeSet_Demo3 {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("P"));
		t.add(new StringBuffer("G"));
		
		System.out.println(t);
		
	}

}
