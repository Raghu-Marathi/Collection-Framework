package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(101,"Raghu");
		map.put(102, "John");
		map.put(103, "Vijay");
		map.put(104,"Rohan");
		map.put(103,"Dhoni"); // here in 103 key already available so here value replacing(or)updating  
		
		System.out.println(map);  //in AbstractMap toString() method is overridden , so it is not calling Object class toString() 
		
		Set<Integer> keySet = map.keySet();
		for(Integer key:keySet) {
			System.out.println(key+"---"+map.get(key));
		}
		
		Collection<String> values = map.values();
		for(String value:values) {
			System.out.println(value);
		}
		
		//we can not apply cursors on map directly
		Set<Entry<Integer,String>> entrySet = map.entrySet(); // Entry is also interface inner interface of map
		// here we got Set is return type ,so we can apply iterator on set.
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		while(itr.hasNext()) {
             Entry<Integer,String> entry = itr.next();
             System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		// or
		System.out.println("======================================================");
		for(Entry<Integer,String> entry2:entrySet) {
			System.out.println(entry2.getKey()+"--"+entry2.getValue());
		}
		
		
		
		
	}

}
