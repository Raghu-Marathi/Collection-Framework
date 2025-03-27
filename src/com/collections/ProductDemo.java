package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product(103, "Mobile", 17000.00)) ;
		al.add(new Product(101, "Laptop", 65000.00));
		al.add(new Product(104, "Mouse", 1200.00));
		al.add(new Product(102, "Keyboard", 900.00));
		
	
		//Collections.sort(al,new ProductIdComparator());
		//Collections.sort(al,new ProductNameComparator());
		//Collections.sort(al,new ProductPriceComparator());
		
//		// anonymous implementation
//		Collections.sort(al, new Comparator<Product>() {
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p2.id-p1.id;
//			}
//		});
//		
//		// anonymous implementation
//				Collections.sort(al, new Comparator<Product>() {
//					@Override
//					public int compare(Product p1, Product p2) {
//						return p2.name.compareTo(p1.name);
//					}
//				});
//		
		Collections.sort(al,new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {  // descending order
				if(p1.price > p2.price) {
					return -100;
				}else if(p1.price<p2.price) {
					return 100;
				}else {
					return 0;
				}
			}
		});
		
		for(Product p:al) {
			System.out.println(p);
		}
	}

}
