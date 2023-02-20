package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;
//
//@Component("st")
public class Student {
	
	private Samosa sam;
	
	

	public Samosa getSam() {
		return sam;
	}

	public void setSam(Samosa sam) {
		this.sam = sam;
	}

	public Student(Samosa sam) {
		super();
		this.sam = sam;
	}
	public void study() {
		this.sam.disp();
		System.out.println("student is reading");
	}
}
