package com.busra.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		
		return "Work hard Play hard";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
