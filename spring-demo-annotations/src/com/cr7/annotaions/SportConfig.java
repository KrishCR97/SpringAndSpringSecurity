package com.cr7.annotaions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
//@ComponentScan("com.cr7.annotaions")
@PropertySource("classpath:sport.properties")
public class SportConfig {
@Bean
public FortuneService sadFortuneservice() {
	return new SadFortuneService();
}
@Bean
public Coach swimCoachservice() {
	return new SwimCoach(sadFortuneservice());
}
}
