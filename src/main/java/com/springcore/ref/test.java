package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		A remp=(A) context.getBean("aref");
		System.out.println(remp.getA());
		System.out.println(remp.getOb().getY());
		System.out.println(remp);
		
	}

}
