package com.practice_list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedList_Demo4 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		ArrayList al=new ArrayList();
		
		//System.out.println(al instanceof Clonable);
		System.out.println(l instanceof Serializable);
		System.out.println(al instanceof Serializable);
		
		System.out.println(l instanceof RandomAccess);
		System.out.println(al instanceof RandomAccess);
		
		System.out.println(l instanceof Cloneable);
		System.out.println(al instanceof Cloneable);
        
	}

}
