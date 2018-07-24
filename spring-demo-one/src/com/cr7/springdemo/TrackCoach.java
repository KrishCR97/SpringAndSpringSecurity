package com.cr7.springdemo;

public class TrackCoach implements Coach {
	FortuneService fortuneService;

	public TrackCoach() {
		super();
	}
	public void myStartUpStuff() {
		System.out.println("In start up");
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWokOut() {
		// TODO Auto-generated method stub
		return "Run hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it " + fortuneService.getFortune();
	}
	
	public void myCleanUpStuff() {
		System.out.println("In my cleanup stuff");
	}

}
