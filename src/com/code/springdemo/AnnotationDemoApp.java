package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve from the spring container
		Coach theCoach = context.getBean("theTennis", Coach.class);
		
		// call the bean method
		System.out.println(theCoach.getDailyWorkout());
		
		// call the fortuneService method
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
