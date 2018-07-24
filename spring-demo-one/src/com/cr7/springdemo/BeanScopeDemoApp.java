package com.cr7.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		TrackCoach coach = context.getBean("myCoach", TrackCoach.class);
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.toString());
		System.out.println(theCoach.toString());
		context.close();
		coach.myCleanUpStuff();
	}

}
