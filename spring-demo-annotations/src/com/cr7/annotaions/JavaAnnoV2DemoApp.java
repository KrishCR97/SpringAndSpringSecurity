package com.cr7.annotaions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaAnnoV2DemoApp {
	public static void main(String... args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach coach = (SwimCoach) context.getBean("swimCoachservice", Coach.class);
		System.out.println(coach.getDailyWorkout());
		context.close();
	}
}
