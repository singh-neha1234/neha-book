package com.mvc.collection.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mvc/collection/lifecycle/config.xml");
        Motorbike m1 = (Motorbike) context.getBean("bike");
		System.out.println(m1);
		context.registerShutdownHook();
	}

}
