package com.failFast;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo4 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<>();
		// here internally while comparing keys it use equals()=> comparing content
		map.put("anand", 101);
		map.put("rani", 102);
		map.put("vijay", 104);
		map.put("raju", 103);
		map.put(new String("anand"),105);  // it will replace first entry value bcoz key is duplicate
		
		
		System.out.println("Size ::"+ map.size());
		System.out.println(map);
		
		System.out.println("============================================");
		
		IdentityHashMap<String, Integer> ihm=new IdentityHashMap<>();  // duplicate keys allowed
		// here internally while comparing keys it use (==), comparing address of obj
		ihm.put("anand", 101);
		ihm.put("rani", 102);
		ihm.put("vijay", 104);
		ihm.put("raju", 103);        
		ihm.put(new String("anand"),105);    
		ihm.put("anand", 106);
		
		System.out.println(" IHM-Size ::"+ ihm.size());
		System.out.println(ihm);
		
		
		
		
		
		
	}

}
