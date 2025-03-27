package com.failFast;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Demo3 {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> map=new ConcurrentHashMap();
		
		map.put(101, "one");
		map.put(102, "two");
		map.put(103, "three");
		map.put(104, "four");
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			map.put(105,"five");  
		}
		
		System.out.println(map);
	}

}
