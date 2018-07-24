package com.cr7.annotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		// TODO Auto-generated constructor stub
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "In tennis coach daily workout implementation";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
