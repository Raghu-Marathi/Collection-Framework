package com.practice_set;

import java.util.TreeSet;

public class Comparator_Demo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new Sample());   //here we passing Comparator obj,and it calls compare(o1,o2).if we desending order then use
		//TreeSet ts=new TreeSet();       // here not passing Comparator obj,by default Comparable obj->it calls compareTo().default natural sorting order(ascending).
		ts.add(82);
		ts.add(36);
		ts.add(10);
		ts.add(90);
		ts.add(25);
		ts.add(47);
		
		System.out.println(ts);
		

	}

}
