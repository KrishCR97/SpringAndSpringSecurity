package com.cr7.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("Execution @Before");
	}

}
