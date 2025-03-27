package com.practice_set;

import java.util.Collections;
import java.util.TreeSet;

public class Comparator_Demo3 {

	public static void main(String[] args) {
		
		Student s1=new Student(100,"Satya");
		Student s2=new Student(140,"Deva");
		Student s3=new Student(30,"Ram");
		Student s4=new Student(80,"Mahesh");
		
		TreeSet ts=new TreeSet();   // by default comparable will call
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		System.out.println(ts);
		
		TreeSet ts2=new TreeSet(new Student2());  // comparator obj,order by name
		ts2.add(s1);
		ts2.add(s2);
		ts2.add(s3);
		ts2.add(s4);
		System.out.println(ts2);
		
		
       
	}

}
