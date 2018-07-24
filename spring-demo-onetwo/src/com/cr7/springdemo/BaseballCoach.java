package com.cr7.springdemo;

public class BaseballCoach implements Coach {
	FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneservice) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneservice;
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 mins in baseball cage";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}
}
