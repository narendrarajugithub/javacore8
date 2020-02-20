package com.ust.core.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SampleStream {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList=new ArrayList<>();
		productList.add(new Product("HP laptop", 0, 150));
		productList.add(new Product("Dell laptop", 1, 200));
		productList.add(new Product("Accer Laptop", 2, 250));
		productList.add(new Product("Sony laptop", 3, 300));
		
	List<Integer>	productList2=	productList.stream().filter(p ->p.getPrice()>0).map(p->p.getPrice()).collect(Collectors.toList()) ;

	System.out.println(productList2);
	}

}
