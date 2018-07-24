package com.cr7.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService){
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWokOut() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes in BC";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}
}
