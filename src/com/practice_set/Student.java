package com.practice_set;

public class Student implements Comparable<Student>{
	
     public	int sid;
	public String name;
	
	//already string , integer implemented from comparable interface(java.lang)
	
	public Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	public String toString() {
		return name+"---"+sid;
	}
//	@Override
//	public int compareTo(Student s) {
//		int sid1=this.sid;
//		int sid2=s.sid;
//		if(sid1<sid2) {
//			return -1;
//		}else if(sid1>sid2) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
	
	@Override
	public int compareTo(Student s) {
		return this.sid-s.sid;
		//return this.name.compareTo(s.name);
	}
	
	// Comparable is allow you to (sort)compare based on only single value.

}
