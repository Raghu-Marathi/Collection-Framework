package com.practice_set;

import java.util.TreeSet;

public class Comparable_Demo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(7);          // 7.compareTo(10)  -> returns -ve   [7,10]
		ts.add(43);         //43.compareTo(7)  -> returns +ve  [7,43,10]
		                    //43.compareTo(10)  ->returns +ve [7,10,43]
		ts.add(26);
		
		System.out.println(ts);
		
		
	}

}
