package com.springcore.sterio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/sterio/sterioconfig.xml");
		Student s1=con.getBean("ob",Student.class);
		System.out.println(s1.hashCode());
		Student s2=con.getBean("ob",Student.class);
		System.out.println(s2.hashCode());
		
		
	}

}
//singletion and proptotype// can do with annotation and xml shit too u can just use scope in xml
// ans annotation shwed aboved