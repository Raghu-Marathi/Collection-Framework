package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {
	
	public static void main(String[] args) {
		
		LinkedHashMap lm=new LinkedHashMap();
		lm.put("AA",100);
		lm.put("CC",50);   //same as HashMap but here Insertion order is preserved
		lm.put("BB", 200);
		lm.put("DD",150);
		System.out.println(lm);
	}

}
