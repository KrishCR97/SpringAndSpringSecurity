package com.cr7.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	public static void main(String... args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("swimCoach",SwimCoach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();
	}
}
