package com.ust.core.java8.stream;

public class Product {
	private String name;
	private int id;
	private Integer price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Product(String name, int id, Integer price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	
	
}
