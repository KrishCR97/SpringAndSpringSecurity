package com.cr7.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(coach.getDailyFortune());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyWokOut());
		System.out.println(((CricketCoach)cricketCoach).getEmail());
		System.out.println(((CricketCoach)cricketCoach).getTeam());
		context.close();
	}

}
