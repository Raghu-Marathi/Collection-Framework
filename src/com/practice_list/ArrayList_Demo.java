package com.practice_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(19);
		l.add(88);
		l.add(14);
		l.add(67);
		l.add(53);
		System.out.println(l);
		
		l.add(3,"Raju");         //adding  at 3rd index ,then remaining values will moveing
		l.add(1,355);
		System.out.println(l);
		
		System.out.println(l.get(3));
		
		l.remove(2);   // removing based on index (pass index value)
		System.out.println(l);
		
		l.set(1,200);          // updating data at index 1
		System.out.println(l);
		
		
		
		List l2=new ArrayList();
		l2.add("iphone");
		l2.add("Realme");
		l2.add("Oppo");
		l2.add("One plus");
		l2.addAll(2, l);        // adding collection at 2nd index
		System.out.println(l2);
		
		

	}

}
