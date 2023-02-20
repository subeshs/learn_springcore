package com.springcore.lifecycle;

public class Some {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("seting price");
		this.price = price;
	}

	public Some() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Some [price=" + price + "]";
	}
	public void init() {
		System.out.println("inside init");
	}
	public void destroy() {
		System.out.println("inside destroy");
	}
	
}
