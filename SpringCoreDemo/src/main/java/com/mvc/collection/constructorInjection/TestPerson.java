package com.mvc.collection.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mvc/collection/constructorInjection/personConfig.xml");
		Person p1 = (Person) context.getBean("person1");
		Person p2 = (Person) context.getBean("person2");
		Person p3 = (Person) context.getBean("person3");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Addition add=(Addition) context.getBean("add1");
        add.doSum();
	}

}
