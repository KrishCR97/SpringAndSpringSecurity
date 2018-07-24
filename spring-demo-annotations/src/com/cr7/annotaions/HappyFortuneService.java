package com.cr7.annotaions;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class HappyFortuneService implements FortuneService {
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;

	private HappyFortuneService() {
		System.out.println("In constructor");
	}

	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("In do my stuff");
	}

	@PreDestroy
	public void doMyCleanUoStuff() {
		System.out.println("In cleanup stuff");
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Good luck man " + this.getEmail();
	}

}
