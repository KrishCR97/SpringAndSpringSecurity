package com.cr7.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach.getEmail());
		coach.doMyCleanUpStuff();
	}

}
