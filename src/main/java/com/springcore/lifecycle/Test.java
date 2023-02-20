package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		context.registerShutdownHook();
		Some s1=(Some) context.getBean("some");
		
		
		System.out.println(s1);
		
		// registering shut down hook
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		pepsi p1=(pepsi) context.getBean("pep");
		System.out.println(p1);
		
		Toamto t1=(Toamto) context.getBean("t1");
		System.out.println(t1);
	}

}
