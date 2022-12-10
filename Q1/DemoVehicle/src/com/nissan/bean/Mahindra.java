package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.Vehicle;
@Component
public class Mahindra implements Vehicle {

	@Override
	public void carInfo() {
		
		System.out.println("Model : Scorpio");
		System.out.println("Price :13.99-21.78 lakh");	
	}

}
