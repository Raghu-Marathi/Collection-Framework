package com.failFast;

import java.util.ArrayList;

public class FailFast {
	
	public static void main(String[] args) {
	
	ArrayList<Integer> al=new ArrayList<>();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	
	for(Integer n:al) {
		System.out.println(n);
		if(n==100) {
			al.add(800);
		}
		//Fail Fast Collections will throw error immediately when we modify collection object while traversing the collection.
		// ex: ArrayList,LinkedList,Vector,HashSet,LHS,...
		
		// FailSafe Collections will not throw any error even if we modify collection object data(add/remove).
		// ex : CopyonWriteArrayList, ConcurrentHashMap etc...
	}
	}
}
