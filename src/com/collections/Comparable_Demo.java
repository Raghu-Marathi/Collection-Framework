package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Demo {
	
	public static void main(String[] args) {
		
		List<Student> al=new ArrayList<>();
		al.add(new Student(13, "Tharun"));
		al.add(new Student(12, "Hari"));
		al.add(new Student(14, "Laxman"));
		al.add(new Student(11, "Raghu"));
		
		Collections.sort(al);
		
		for(Student s:al) {
			System.out.println(s);
		}
		
	}

}
