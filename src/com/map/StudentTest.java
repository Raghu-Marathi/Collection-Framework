package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101, "Smith");
		Student s2=new Student(102, "Kohli");
		Student s3=new Student(103, "Warner");
		
		Map<Integer, Student> map=new HashMap<Integer, Student>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		//System.out.println(map);
		
//		Set<Integer> keySet = map.keySet();
//		for(Integer key : keySet) {
//			System.out.println(map.get(key));  // here we are passing key(1,2,3) then it return value(student obj)
//		}
		
		Set<Entry<Integer,Student>> entrySet = map.entrySet();
		for(Entry<Integer,Student> entry:entrySet) {
			//System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
