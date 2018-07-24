package com.cr7.springdemo;

public class CricketCoach implements Coach {
	FortuneService fortuneService;
	private String email;
	private String team;

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWokOut() {
		// TODO Auto-generated method stub
		return "Hello in get Cricket";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
