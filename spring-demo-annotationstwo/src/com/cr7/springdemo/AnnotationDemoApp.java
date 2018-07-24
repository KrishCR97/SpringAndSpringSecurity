package com.cr7.springdemo;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String... args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyFortune());
		context.close();
	}
}
