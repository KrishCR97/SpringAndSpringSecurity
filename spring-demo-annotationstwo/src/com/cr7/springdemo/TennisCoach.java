package com.cr7.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomService")
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practise backend volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void cleanMyStuff() {
		System.out.println("Cleaning");
	}
	
	@PreDestroy
	public void cleanUpMyStuff() {
		System.out.println("Cleaned");
	}

}
