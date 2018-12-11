package com.varun.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.varun.spring.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
    // Read the spring config file
		ClassPathXmlApplicationContext context=
				     new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
   //get the bean from spring container	
		Coach thecoach=context.getBean("tennisCoach", Coach.class);
   //get the bean from spring container	
		Coach alphacoach=context.getBean("tennisCoach", Coach.class);	
		
		boolean result = (thecoach == alphacoach);
		
		System.out.println("\nPointing to the same object :"+result);
		
		System.out.println("\nMemory location of theCoach :"+thecoach);
		
		System.out.println("\nMemory location of alphaCoach :"+alphacoach);
	
	// close the context
		context.close();
		
	}
}
