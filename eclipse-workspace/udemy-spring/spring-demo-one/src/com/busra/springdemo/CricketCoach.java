package com.busra.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAdress;
	private String team;
	
	
	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter method -setEmailAdress ");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method -setTeam ");
		this.team = team;
	}

	//create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor ");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method -setFortuneService ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise best bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
