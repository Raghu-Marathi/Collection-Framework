package com.practice_list;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		//Vector v1=new Vector(25);  // here initial capacity=25 if it reach ->50 ->100 ->200 ... it will double
		//Vector v2=new Vector(15,5);  // here initial capacity=15 if it reach then increment 5 every time like 20,25,30 ...
		
		v.addElement("Mobile");
		v.add("Laptop");
		v.addElement(63);
		v.add(1,71);
		v.addElement(99);
		v.add("Mouse");
		
		System.out.println("Capacity : "+v.capacity());  //default capacity=10 if it reach it will double 20 then 40  ,  80 ...
		System.out.println(v);
		System.out.println(v.elementAt(2));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		v.removeElement(71);
		v.removeElementAt(3);
		System.out.println(v);
		
		v.removeAllElements();
		System.out.println(v);
		
		
	}

}
