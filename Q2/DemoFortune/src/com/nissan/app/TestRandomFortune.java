package com.nissan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.ICoach;

public class TestRandomFortune {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach theCoach=context.getBean("fortuneService",ICoach.class);
		System.out.println("Your todays Fortune is: "+theCoach.getFortune());

	}

}
