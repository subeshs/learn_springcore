package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean ,DisposableBean{
	private int price;

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("takig pepsi");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("put the bottle back");
	}
	
}
