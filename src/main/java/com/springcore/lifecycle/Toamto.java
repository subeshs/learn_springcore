package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Toamto {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Toamto(String name) {
		super();
		this.name = name;
	}

	public Toamto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Toamto [name=" + name + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("inside starting meth");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("inside ending method");
	}
	
}
