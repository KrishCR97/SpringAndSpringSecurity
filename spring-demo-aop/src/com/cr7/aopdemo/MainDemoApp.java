package com.cr7.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cr7.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDao = context.getBean("accountDAO", AccountDAO.class);
		accountDao.addAccount();
		context.close();
	}

}
