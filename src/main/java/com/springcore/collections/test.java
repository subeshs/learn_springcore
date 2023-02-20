package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");
		
		emp emp1=(emp)context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getPhones().getClass().getName());
		
	}

}
