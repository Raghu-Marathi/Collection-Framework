package com.practice_set;

import java.util.Comparator;

public class Student2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		String str1=s1.name;
		String str2=s2.name;
		
		return str1.compareTo(str2);
	}
	
    
	
}
