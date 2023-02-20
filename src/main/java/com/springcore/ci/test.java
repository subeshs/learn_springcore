package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
			
			Person p1=(Person)context.getBean("person");
			Addition a1=(Addition)context.getBean("add");
			//System.out.println(p1);
			a1.doSum();
	}

}
