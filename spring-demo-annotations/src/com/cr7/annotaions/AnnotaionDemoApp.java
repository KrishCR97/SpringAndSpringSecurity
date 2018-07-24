package com.cr7.annotaions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}