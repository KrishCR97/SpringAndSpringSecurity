package com.cr7.annotaions;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100 meters "+this.team;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
