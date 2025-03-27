package com.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Demo {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(75);
		v.add(32);
		v.add(26);
		v.add(91);
		v.add(44);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			int i=(Integer)e.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println(v);
		
	}

}
