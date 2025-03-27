package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(101,"Raghu");
		map.put(102, "John");
		map.put(103, "Vijay");
		map.put(104,"Rohan");
		map.put(103,"Dhoni"); // here in 103 key already available so here value replacing(or)updating  
		
		System.out.println(map);  //in AbstractMap toString() method is overridden , so it is not calling Object class toString() 
		
		System.out.println("Map Size ::"+map.size());
		
		System.out.println(map.get(102));   // returns value (John)
		System.out.println(map.get(222));   // if the given key not available then it return null
		
		System.out.println(map.containsKey(103));
		System.out.println(map.containsKey(209));
		
		System.out.println(map.containsValue("Raghu"));
		System.out.println(map.containsValue("Arun"));
		
		System.out.println(map.isEmpty());
		
		map.remove(104);
		System.out.println(map);
		map.clear();
		
		System.out.println("Map Size ::"+map.size());
		
		
	}

}
