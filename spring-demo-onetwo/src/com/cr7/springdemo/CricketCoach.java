package com.cr7.springdemo;

public class CricketCoach implements Coach {
	private String email;
	private String team;
	FortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	public void doMyStartUpStuff() {
		System.out.println("My start up stuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("Do my cleanup stuff");
	}

}
