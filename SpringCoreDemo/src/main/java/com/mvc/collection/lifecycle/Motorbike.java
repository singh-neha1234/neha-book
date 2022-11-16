package com.mvc.collection.lifecycle;

public class Motorbike {
	
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Motorbike [name=" + name + ", price=" + price + "]";
	}
	
	public void init() {
		System.out.println("bean has been initialized");
	}
	
	public void destroy() {
		System.out.println("bean has been destroy");
	}

}
