package com.ust.core.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList=new ArrayList<>();
		productList.add(new Product("HP laptop", 0, 150));
		productList.add(new Product("Dell laptop", 1, 200));
		productList.add(new Product("Accer Laptop", 2, 250));
		productList.add(new Product("Sony laptop", 3, 300));
		
	productList.stream().filter(p ->p.getPrice()>150)
	//.collect(Collectors.toList())
	.forEach(product->System.out.println(product.getPrice()));

}

}
