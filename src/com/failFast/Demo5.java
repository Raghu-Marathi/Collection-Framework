package com.failFast;

import java.util.WeakHashMap;

public class Demo5 {
	
	public static void main(String[] args) {
		WeakHashMap<Integer, String> whm=new WeakHashMap<>();
		
		whm.put(1,"hi");
		whm.put(2,"hello");
		whm.put(4, "java");
		whm.put(3,"bye");
		
		System.out.println(whm);
		
		// WeakHashMap keys will have weak reference that means they are eligible for Garbage Collector.
		// Gc will dominate WeakHashMap.
		
	}

}
