package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class config {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"sa","co","tr"})
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}
}
