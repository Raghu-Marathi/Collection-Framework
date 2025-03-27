package com.practice_set;

import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add(71);          // here first which type adding those type objects only add,bcoz while sorting it will compare with old object.  here what obj adding those must implment from comparable interface
		                    // Integer ,String ... already implemented
		//ts.add("Raju");  // heterogenious objects are not allowed ,  ClassCastException
		ts.add(52);        // Homogenious data only allowed, because here objects comparing for sorting
		ts.add(98);        // diffrent type of obj's we can't compare
		ts.add(26);
		//ts.add(null);    // nulls not allowed // only first allowed but
		ts.add(14);
		ts.add(52);
		ts.add(88);
		ts.add(17);
		
		System.out.println(ts);
		
		System.out.println(ts.first()); 
		System.out.println(ts.last());
		
		System.out.println(ts.headSet(52));  // returns <52
		System.out.println(ts.tailSet(71));  // returns >=71 
		
		System.out.println(ts.subSet(26,88));  // returns >=obj1 and <obj2
		

	}

}
