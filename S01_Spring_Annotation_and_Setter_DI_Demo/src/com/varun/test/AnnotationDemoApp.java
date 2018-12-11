package com.varun.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.varun.spring.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
    // Read the spring config file
		ClassPathXmlApplicationContext context=
				     new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
   //get the bean from spring container	
		Coach thecoach=context.getBean("thegoodcoach", Coach.class);
	
   // call a method on the bean		
		System.out.println(thecoach.getDailyWorkout());
		
   // call method to get daily fortune		
		System.out.println(thecoach.getDailyFortune());
	
   // close the context
		context.close();
		
	}
}
