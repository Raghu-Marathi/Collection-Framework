package com.practice_list;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();  // here always stores only objects
		
		// ArrayList<int> al2=new ArrayList<int>();   // int is datatype not allowed only classes allowed 
		                                             
		
		al.add(100);
		al.add(27);
		//al.add(23.4);       // stores only integer values 
        al.add(43);
        al.add(76);
       al.add(0, 59);
        System.out.println(al);
        System.out.println("Size is :"+al.size());
        
        System.out.println("Getting element :"+al.get(2)); // it will return 3rd element,because index starts from 0
        al.set(1,38);  //setting index 1 value 38  means changing the value
       
        System.out.println(al);
        System.out.println("Size is :"+al.size());
        
	}

}
