package com.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();    // initial capacity 16 fill ratio (0.75), if it fills then capacity will double
		                            // here we called 16 buckets,in that each bucket sometimes it can store multiple objects
		
		hm.put(10,"Ram");          //Key-Value pair  both are objects only
		hm.put(70,"NTR");         // key-value pair = entry
		hm.put(50,"Arjun");
		hm.put("AAA",43);         
		hm.put(70,"Praba");
		System.out.println(hm);     //Insertion order is not preserved
		
		HashMap hm2=new HashMap();
		hm2.put(26, "Bheema");
		hm2.putAll(hm);
		hm2.put(48,"Garuda");
		System.out.println(hm2);
		
		System.out.println(hm2.get(50));
		hm2.remove(10);
		System.out.println(hm2);
		
		System.out.println(hm2.containsKey(55));
		System.out.println(hm2.containsValue("Garuda"));
		
		System.out.println(hm.isEmpty());
		System.out.println(hm2.size());
		
	    Set s=hm2.keySet();
		System.out.println(s);
		
		Collection c=hm2.values();
		System.out.println(c);
		
		Set s2=hm2.entrySet();
		System.out.println(s2);
		
//		hm2.clear();
//		System.out.println(hm2);
		
		Iterator itr=s2.iterator();
		while(itr.hasNext()) {            // Entry is innerInterface of Map Interface
			Map.Entry m1=(Map.Entry) itr.next();
			System.out.println(m1.getKey()+"---"+m1.getValue());   // Entry interface methods
			
			if(m1.getKey().equals("AAA")) {
				m1.setValue(2000);
			}
		}
         System.out.println(hm2);
         
         hm2.put(null, "RRR");   // null for keys allowed only once, for values any no.of times allowed
         System.out.println(hm2);
         
         Collections.synchronizedMap(hm2);  //Here Map converted to SynchronizedMap ,means now its thread safe
         System.out.println(hm2);           // synchronizedMap() is static method from Collections class  
         
         
      
         
     
		
	}

}
