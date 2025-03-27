package com.practice_set;

import java.util.TreeSet;

public class Comparator_Demo2 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new Sample2()); 	
        ts.add("Raghu");
        ts.add("Ramu");
        ts.add("Savitri");
        ts.add("Rajini");
        ts.add("Hanuman");
       
        
        System.out.println(ts);
	}

}
