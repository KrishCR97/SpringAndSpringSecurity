package com.cr7.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	@Value("${cr7.team}")
	private String team;

	public SwimCoach(FortuneService theFortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100 meters as a warm up " + this.team;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
