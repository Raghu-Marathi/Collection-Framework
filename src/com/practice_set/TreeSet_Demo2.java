package com.practice_set;

import java.util.TreeSet;

public class TreeSet_Demo2 {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Ramesh", "HYD");
		Employee e2=new Employee(102, "Hari", "Bang");
		Employee e3=new Employee(103, "Venky", "CHN");
		
		TreeSet ts=new TreeSet();
		ts.add(e1);         //adding object of class must implement comparable interface  
		ts.add(e2);         // otherwise, ClassCastException
		ts.add(e3);
		
		System.out.println(ts);
	}

}
