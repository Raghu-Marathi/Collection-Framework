package com.failFast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(101, "one");
		map.put(102, "two");
		map.put(103, "three");
		map.put(104, "four");
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			map.put(105,"five");  // ConcurrentModificationException
		}
		
		
	}

}
