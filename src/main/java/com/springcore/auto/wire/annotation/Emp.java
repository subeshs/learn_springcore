package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("setting setters");
		this.address = address;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Emp(Address address) {
		
		super();
		System.out.println("setting cons");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [Address=" + address + "]";
	}

	

	
	
}
