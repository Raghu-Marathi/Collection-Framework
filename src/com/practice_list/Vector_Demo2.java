package com.practice_list;

import java.util.Vector;

public class Vector_Demo2 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		System.out.println("Capacity ="+v.capacity());
		for(int i=21;i<=30;i++) {
			v.add(i);
		}
		System.out.println(v);
		v.addElement("RRR");
		System.out.println("Capacity ="+v.capacity());  
		System.out.println(v);
	}

}
