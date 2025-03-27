package com.map;

public class Student {
	
		 int id;
		 String name;
		 
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {    // here overridding object class toString(),if not override then o/p some hashCode like com.map.Student@6504e3b2  
			return id+"--"+name;
		}
		 
		
		 
		
	

}
