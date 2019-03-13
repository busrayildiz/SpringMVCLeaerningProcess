package com.busra.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach" , Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach" , Coach.class);
		
		//check if they are the same
		boolean result = theCoach == alphaCoach ;
		
		System.out.println("\n Pointing to the same object: " + result );
		
		System.out.println("\n Memory location for theCoach" + theCoach);
		
		System.out.println("\n Memory location for alphaCoach" + alphaCoach);


		context.close();
		
	}

}
