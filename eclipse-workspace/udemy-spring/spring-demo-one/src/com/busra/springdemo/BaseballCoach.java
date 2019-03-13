package com.busra.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practise";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("bbCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("bbCoach: inside method doMyCleanupStuffYoYo");
	}
	
}
