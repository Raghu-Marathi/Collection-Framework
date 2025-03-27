package com.practice_list;

import java.util.ArrayList;
import java.util.List;

public class Test_Emp {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "Ram","HYD");
		Employee e2=new Employee(102, "Laxman","BANG");
		Employee e3=new Employee(103, "Bharat","CHN");
		
		
		List<Employee> le=new ArrayList<Employee>();
		le.add(e1);
		le.add(e2);
		le.add(e3);
		
		//System.out.println(le);
		
		for(Employee k:le) {
			System.out.println(k);
		}
		
	}

}
