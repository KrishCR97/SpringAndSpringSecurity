package com.cr7.annotaions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoJavaDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
