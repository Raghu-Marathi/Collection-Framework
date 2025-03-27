package com.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_Demo {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("Mahesh babu");
		l.add("Prabas");
		l.add("Allu Arjun");
		l.add("NTR");
		 
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()) {
			String s=(String) ltr.next();
			if(s.equals("Allu Arjun")) {
				ltr.remove();
			}
			if(s.equals("NTR"))
			{
				ltr.set("Kalyan");    // updating/modifying
			}
			if(s.equals("Mahesh babu")) {
				ltr.add("Krishna");        // after, it will add
			}
		}
		System.out.println(l);
		
				
	}

}
