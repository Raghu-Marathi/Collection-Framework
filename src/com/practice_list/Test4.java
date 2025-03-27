
package com.practice_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<String>();
		l1.add("Cricket");
		l1.add("Chess");
		l1.add("Badminton");
		l1.add("VollyBall");
		
		System.out.println(l1);
		l1.remove("Chess");
		l1.remove(2);     // removing based on index
		System.out.println(l1);
		
		l1.add(2,"Kabaddi");
		System.out.println(l1);
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(18);
		l2.add(07);
		l2.add(45);
		l2.add(93);
		l2.add(10);
		
		System.out.println(l2);       // it  prints insertion order
		
		System.out.println("After sorting ....");
		Collections.sort(l2);         // it prints ascending order
		System.out.println(l2);
		
		
	}

}
