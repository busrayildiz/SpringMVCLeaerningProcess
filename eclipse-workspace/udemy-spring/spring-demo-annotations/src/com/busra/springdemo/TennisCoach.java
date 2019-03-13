package com.busra.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("<< TennisCoach : inside defoult constructor >>");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("tennisCoach inside doMyStartupStuff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("tennisCoach inside doMyCleanupStuff");
	}
	
	
	
	
	
	
	// define a setter method
	/*	
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("<< TennisCoach : inside setter method >>");

		fortuneService = theFortuneService;
	}
	
	
	

	@Autowired
	public TennisCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
*/	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


}

