package com.practice_set;

import java.util.HashSet;

public class HashSet_Demo {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();    // default capacity is 16 fill ration 0.75 ,if 75% here(12) reached then capacity will increse maybe it will double
	//HashSet hs=new HashSet(200);  //here 150 reach then increse
	//HashSet hs2=new HashSet(200,0.5f); // capacity is 200 but if it reach 50%(100) then cap will increse
		hs.add(93);                
		hs.add(82);              // not insertion order preserved
		hs.add(55);
		hs.add(82);              // here duplicates not raising error , just simply false in execution
		hs.add(67);              // internal data structure is hashTable.
		hs.add(null);            // obj default value is null
		hs.add(55);                // null always stores in 0th index
		hs.add(null);             // only one null allowed more than one its a duplicate
		System.out.println(hs);
	}

}
