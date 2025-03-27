package com.collections;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return (int)p1.price-(int)p2.price;
	}

}
