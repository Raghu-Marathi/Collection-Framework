package com.practice_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(22);
		l.add(10);
		l.add(35);
		l.add(67);
		l.add(22);
		l.add(59);
		l.add(22);
		l.add(85);
		
		System.out.println(l.indexOf((Integer)22));   // here pass object and returns first time occuerd index 
		System.out.println(l.lastIndexOf((Integer)22)); // returns last time occuerd index
		
		System.out.println(l.indexOf((Integer)124));  // if data(124) not available ,returns -1
	}

}
