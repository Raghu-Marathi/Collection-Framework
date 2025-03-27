package com.practice_set;

import java.util.Comparator;

public class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		int str1 = s1.length();
		int str2 = s2.length();
		if(str1<str2) {
			return -1;
		}else if(str1>str2) {
			return +1;
		}else {
			return s1.compareTo(s2);
		}
	}

}
