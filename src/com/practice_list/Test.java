package com.practice_list;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();    
		
		al.add(10);
		al.add(20);
		al.add(10);           // it can store duplicates 
		al.add("Raghu");
		al.add(true);
		al.add(24.52);
		
		Integer i1=null;       //  it can store nulls also
		al.add(null);
		al.add(i1);
		
		System.out.println(al);
	}

}
