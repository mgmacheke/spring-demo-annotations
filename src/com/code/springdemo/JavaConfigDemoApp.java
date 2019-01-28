package com.code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
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
