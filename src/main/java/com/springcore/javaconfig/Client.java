package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= 
				new AnnotationConfigApplicationContext(config.class);
		Student s1=con.getBean("tr", Student.class);
		System.out.println(s1);
		s1.study();
		
		
	}

}
